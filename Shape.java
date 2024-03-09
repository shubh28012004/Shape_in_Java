package Assignment6;

abstract class Shape {
    abstract void calculateShape();
    abstract void calculatePerimeter();

    void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
        calculateShape();
        calculatePerimeter();
    }
}

