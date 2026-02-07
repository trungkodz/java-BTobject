package bai08;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

public class bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Circle h1 = new Circle(3.6);
        System.out.println(h1);

        int n;
        double tong = 0;
        System.out.print("so hinh tron la: ");
        n = sc.nextInt();
        Circle mang[] = new Circle[n];
        System.out.println("thong tin cac hinh: ");
        for (int i = 0; i < n; i++) {
            double radiusrand = rand.nextDouble(5, 100);
            mang[i] = new Circle(radiusrand);
        }

        double max = mang[0].Area();
        Circle min = mang[0];

        for (int i = 0; i < n; i++) {
            System.out.println("hinh " + (i + 1));
            System.out.println(mang[i]);
            tong = tong + mang[i].Area();
            if (mang[i].Area() > max) {
                max = mang[i].Area();
            }
            if (mang[i].getradius() < min.getradius()) {
                min = mang[i];
            }
        }

        System.out.println("tong Area: " + tong);
        System.out.println("Area max = " + max);
        System.out.println("thong tin HT min: " + "\n" + min);

    }
}