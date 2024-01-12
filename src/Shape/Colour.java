package Shape;

public enum Colour {
    RED("Czerwony"),
    BLUE("Niebieski"),
    YELLOW("Żółty"),
    GREEN("Zielony");

    private String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
