package Assignment6;

import java.util.Scanner;

public class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the base of the pyramid:");
        baseLength = scanner.nextDouble();
        System.out.println("Enter the width of the base of the pyramid:");
        baseWidth = scanner.nextDouble();
        System.out.println("Enter the height of the pyramid:");
        height = scanner.nextDouble();
        double area = baseLength * baseWidth;
        System.out.println("Base area of the pyramid: " + area);
    }

    @Override
    void calculatePerimeter() {
        // Not applicable for a pyramid
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0 / 3.0) * baseLength * baseWidth * height;
        System.out.println("Volume of the pyramid: " + volume);
    }
}
