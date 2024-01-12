package Shape;

public class Shape {
    private String name;
    private char size;
    private Colour colour;

    public Shape(String name, char size, Colour colour) {
        this.name = name;
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shape.Shape{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", colour=" + colour.getColour() +
                '}';
    }

    public Colour getColour() {
        return colour;
    }
}