package bai13;

public class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width; // rong
        this.height = height; // dai
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }
}
