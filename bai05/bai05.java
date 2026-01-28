package bai05;

import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;

public class bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msv1 = sc.nextLine();
        String hoten1 = sc.nextLine();
        double dlt1 = sc.nextDouble();
        double dth1 = sc.nextDouble();
        sc.nextLine();

        sinhvien sv1 = new sinhvien(msv1, hoten1, dlt1, dth1);

        sv1.thongtinsv();
    }
}