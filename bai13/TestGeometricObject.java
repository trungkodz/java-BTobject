package bai13;

import java.util.Scanner;

public class TestGeometricObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("radius = ");
        double radius = sc.nextDouble();
        System.out.print("width = ");
        double width = sc.nextDouble();
        System.out.print("height = ");
        double height = sc.nextDouble();

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(width, height);

        TestGeometricObject T = new TestGeometricObject();
        System.out.println("compare two shapes! ");
        T.sosanh(c, r);
        T.thongtin(c, r);

    }

    public void sosanh(Circle c, Rectangle r) {
        if (c.getArea() > r.getArea()) {
            System.out.println("Circle Area > Rectanglr Area !");
        } else {
            System.out.println("Rectangle Area > Circle Area");
        }
    }

    public void thongtin(Circle c, Rectangle r) {
        System.out.println("Area and Perimeter info!");
        System.out.println("Area Ciecle: " + c.getArea());
        System.out.println("Perimeter Ciecle: " + c.getPerimeter());
        System.out.println("Area Rectangle: " + r.getArea());
        System.out.println("Perimeter Rectanglr: " + r.getPerimeter());
    }

}
