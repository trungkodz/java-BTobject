package bai10;

public class Circle extends point {
    private double radius;

    public Circle() {

    }

    public Circle(double radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    public double getradius() {
        return this.radius;
    }

    public double getdeameter() {
        return this.radius * 2;
    }

    public double getcircumference() {
        return 2 * 3.14 * this.radius;
    }

    public double getarea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "x = " + getx() + "\n" + "y = " + gety() + "\n" + "radius = " + this.radius + "\n";
    }
}
