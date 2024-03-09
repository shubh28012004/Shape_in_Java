package Assignment6;

import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        height = scanner.nextDouble();
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of the cylinder: " + area);
    }

    @Override
    void calculatePerimeter() {
        // Not applicable for a cylinder
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
