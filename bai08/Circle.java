package bai08;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return this.radius * this.radius * 3.14;
    }

    public double getradius() {
        return radius;
    }

    @Override
    public String toString() {
        return "ban kinh: " + radius + "\n" + "dien tich: " + Area() + "\n";

    }

}
