package Assignment6;

import java.util.Scanner;

public class Circle extends Shape implements Volume {
    private double radius;

    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    @Override
    public void calculateVolume() {
        // Not applicable for a circle, so leave it empty
        System.out.println("Volume calculation is not applicable for a circle");
    }
}


