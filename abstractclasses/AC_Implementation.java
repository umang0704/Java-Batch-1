package abstractclasses;

abstract class Shape {

    abstract void area();

    abstract void perimiter();
}

class Circle extends Shape {

    private float radius;

    @Override
    void area() {
        System.out.println(3.14 * this.radius * this.radius);
    }

    @Override
    void perimiter() {
        System.out.println(2 * 3.24 * this.radius);
    }

    public Circle(float radius) {
        this.radius = radius;
    }

}

class Square extends Shape {

    private double side;

    @Override
    void area() {
        System.out.println(this.side * this.side);
    }

    @Override
    void perimiter() {
        System.out.println(4 * this.side);

    }

    public Square(double side) {
        this.side = side;
    }

}

public class AC_Implementation {

    public static void main(String[] args) {
        Shape obj = new Circle(10);
        obj.area();
        obj.perimiter();

        Shape obj1 = new Square(5);
        obj1.area();
        obj1.perimiter();
    }
}
