package Assignment6;

import java.util.Scanner;

public class Square extends Shape  {
    private double side;

    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square:");
        side = scanner.nextDouble();
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
    }

    
}
