package Assignment6;

import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    private double radius;

    @Override
    void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        radius = scanner.nextDouble();
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface area of the sphere: " + area);
    }

    @Override
    void calculatePerimeter() {
        // Not applicable for a sphere
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }
}


