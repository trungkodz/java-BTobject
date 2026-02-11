package bai08;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

public class bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int N = sc.nextInt();
        CircleCollection hinhtron = new CircleCollection();
        for (int i = 0; i < N; i++) {
            double rd = rand.nextDouble(1, 100);
            Circle ht = new Circle(rd);
            hinhtron.addCircle(ht);
        }

        System.out.println("thong tin cac hinh da nhap:");
        System.out.println(hinhtron);
        System.out.println("tong Area: " + hinhtron.tong());
        System.out.println("max la: " + hinhtron.max());
        System.out.println("min la: " + hinhtron.min());
        Circle minc = hinhtron.min1();
        System.out.println("hinh tron min: " + "\n" + minc.toString());

    }
}