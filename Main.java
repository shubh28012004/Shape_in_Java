package Assignment6;

// Name : Shubh Agarwal
// AIML B2 
// 22070126108

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("Select a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Circle circle = new Circle();
                    circle.showShape("Circle");
                    circle.calculateVolume();
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    rectangle.showShape("Rectangle");
                    
                    break;
                case 3:
                    Square square = new Square();
                    square.showShape("Square");
                    
                    break;
                case 4:
                    Sphere sphere = new Sphere();
                    sphere.showShape("Sphere");
                    sphere.calculateVolume();
                    break;
                case 5:
                    Cylinder cylinder = new Cylinder();
                    cylinder.showShape("Cylinder");
                    cylinder.calculateVolume();
                    break;
                case 6:
                    Pyramid pyramid = new Pyramid();
                    pyramid.showShape("Pyramid");
                    pyramid.calculateVolume();
                    break;
                case 7:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        System.out.println("Program terminated.");
    }
}
