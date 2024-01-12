package Doc;

public class Document {
    private String name;
    private int pageCount;
    private String signedBy;
    private boolean isAccepted;
    private DocumentType documentType;

    public Document(String name, int pageCount, String signedBy, boolean isAccepted, DocumentType documentType) {
        this.name = name;
        this.pageCount = pageCount;
        this.signedBy = signedBy;
        this.isAccepted = isAccepted;
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "Dokument: " +
                name + ", ilość stron: " + pageCount + ", wydany przez: " + signedBy + ".\n"
                + "Typ dokumentu: " + documentType.getInfoPoPolsku() + ", ID: " + documentType.getAdminID();
    }


}
