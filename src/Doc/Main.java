package Doc;

import Shape.Colour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Document> documents = new ArrayList<Document>();
        documentsInit(documents);

        System.out.println("===========================================================================");
        System.out.println("---------------------------------------------------------------------------");
        for (Document d : documents) {
            System.out.println(d);
            System.out.println("---------------------------------------------------------------------------");
        }
        System.out.println("===========================================================================");

        System.out.println("Chciałbyś dodać swoje dokumenty?");
        System.out.println("t - tak\n");
        char choiceAdd = s.nextLine().charAt(0);
        if (choiceAdd == 't') {
            System.out.println("Podaj nazwę dokumentu");
            String name = s.nextLine();
            System.out.println("Podaj ilość stron");
            int count = s.nextInt();
            s.nextLine();
            System.out.println("Wpisz, kto wydał dokument");
            String signedBy = s.nextLine();
            System.out.println("Wpisz tak czy nie aby wybrać czy dokument został zatwierdzony przez odbiorcę");
            String choiceBool = s.nextLine();
            boolean isAccepted;
            isAccepted = choiceBool.equalsIgnoreCase("tak");

            System.out.println("Podaj typ dokumentu");
            String docType = s.nextLine();


            DocumentType documentType = getDocumentType(docType);
            if (documentType != null) {
                documents.add(new Document(name, count, signedBy, isAccepted, documentType));
                System.out.println("Dodano dokument");
            } else {
                while (documentType == null) {
                    System.out.println("Pole typ dokumentu jest puste\nSpróbuj ponownie");
                    docType = s.nextLine();

                    documentType = getDocumentType(docType);
                }
                documents.add(new Document(name, count, signedBy, isAccepted, documentType));
                System.out.println("Dodano dokument");
            }

            System.out.println("===========================================================================");
            System.out.println("---------------------------------------------------------------------------");
            for (Document d : documents) {
                System.out.println(d);
                System.out.println("---------------------------------------------------------------------------");
            }
            System.out.println("===========================================================================");

            System.out.println("Podaj id admina aby utworzyć dokument (1 lub 2)");
            int docTypeInt = s.nextInt();
            documentType = getDocumentType(docTypeInt);

            documents.add(new Document("Losowy Dokument 12", 15, "Szkoła Górnik", true, documentType));
            System.out.println("Dodano dokument");


            System.out.println("===========================================================================");
            System.out.println("---------------------------------------------------------------------------");
            for (Document d : documents) {
                System.out.println(d);
                System.out.println("---------------------------------------------------------------------------");

            }
        }
    }

    private static void documentsInit(List<Document> documents) {
        documents.add(new Document("Paragon nr. 15151", 1, "Sklep gospodarczo-spożywczy", true, DocumentType.INVOICE));
        documents.add(new Document("Faktura nr. 2", 4, "Sklep AGD", true, DocumentType.INVOICE));
        documents.add(new Document("Kontrakt o prace", 3, "Bimbrownia", true, DocumentType.CONTRACT));
        documents.add(new Document("Kontrakt o zatrudnienie", 1, "Restauracja Pasztet", false, DocumentType.CONTRACT));
        documents.add(new Document("Akt Notarialny Sądowy", 12, "Prokuratura", true, DocumentType.NOTARIAL_ACT));
        documents.add(new Document("Certyfikat ukończenia szkoły podstawowej", 1, "Szkoła Podstawowa", true, DocumentType.CERTIFICATE));
    }

    public static DocumentType getDocumentType(String docType) {
        switch (docType) {
            case "Faktura" -> {
                return DocumentType.INVOICE;
            }
            case "Kontrakt" -> {
                return DocumentType.CONTRACT;
            }
            default -> {
                return null;
            }
        }
    }

    public static DocumentType getDocumentType(int docType) {
        switch (docType) {
            case 1 -> {
                return DocumentType.NOTARIAL_ACT;
            }
            case 2 -> {
                return DocumentType.CERTIFICATE;
            }
            default -> {
                return null;
            }
        }
    }
}

