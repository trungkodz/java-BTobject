package bai10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

public class bai10 {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00"); // lấy kết quả 2 số sau ,
        ArrayList<Circle> mc = new ArrayList<>();
        System.out.print("so luong hinh tron muon nhap: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("hinh " + (i + 1) + "!");
            System.out.print("radius = ");
            double c = sc.nextDouble();
            Circle circle = new Circle(c, 1, 2);
            mc.add(circle);
        }
        System.out.println("thong tin cac hinh tron!");
        for (int i = 0; i < mc.size(); i++) {
            System.out.println("==========================================" + "\n" + "hinh " + (i + 1));
            System.out.println("diameter = " + df.format(mc.get(i).getdeameter()));
            System.out.println("circumference = " + df.format(mc.get(i).getcircumference()));
            System.out.println("area = " + df.format(mc.get(i).getarea()));
        }
    }
}
