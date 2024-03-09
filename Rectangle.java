package Assignment6;
import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    
}

