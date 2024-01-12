package Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Shape> shapesList = new ArrayList<Shape>();


        shapesList.add(new Shape("Kwadrat", 'M', Colour.BLUE));
        shapesList.add(new Shape("Koło", 'L', Colour.YELLOW));
        shapesList.add(new Shape("Trójkąt", 'S', Colour.GREEN));
        shapesList.add(new Shape("Romb", 'S', Colour.RED));

        for(Shape s : shapesList){
            System.out.println(s.getColour());
        }

        System.out.println("Wprowadź nazwę, rozmiar i kolor kształtu");
        String name = scan.nextLine();
        char size = scan.nextLine().charAt(0);

        String colourName = scan.nextLine();

        Colour c = getColour(colourName);
        if(c != null){
            shapesList.add(new Shape(name, size, c));
            System.out.println("Utworzono obiekt");
        }

        for(Shape s : shapesList){
            System.out.println(s);
        }

    }

    public static Colour getColour(String colourName){
        switch (colourName){
            case "Czerwony" -> {
                return Colour.RED;
            }
            case "Żółty" -> {
                return Colour.YELLOW;
            }
            case "Zielony" -> {
                return Colour.GREEN;
            }
            case "Niebieski" -> {
                return Colour.BLUE;
            }
            default -> {return null;}
        }
    }
}