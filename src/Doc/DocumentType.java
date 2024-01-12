package Doc;

public enum DocumentType {
    INVOICE("Faktura"),
    CONTRACT("Kontrakt"),
    NOTARIAL_ACT("Akt Notarialny", 1),
    CERTIFICATE("Certyfikat", 2);

    private String infoPoPolsku;
    private int adminID;
    DocumentType(String infoPoPolsku) {
        this.infoPoPolsku = infoPoPolsku;
    }

    DocumentType(String infoPoPolsku, int adminID) {
        this.infoPoPolsku = infoPoPolsku;
        this.adminID = adminID;
    }

    public String getInfoPoPolsku() {
        return infoPoPolsku;
    }

    public int getAdminID() {
        return adminID;
    }
}
