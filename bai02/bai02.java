package bai02;

import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;

public class bai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        hinhtamgiac htg = new hinhtamgiac(a, b, c);
        if (htg.latamgiac() == true) {
            System.out.println("chu vi: " + htg.getchuvi());
            System.out.println("dien tich: " + htg.getdientich());

        } else {
            System.out.println("day ko phai la tam giac");
        }
    }
}