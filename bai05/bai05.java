package bai05;

import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;
import java.io.*;

public class bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msv1 = sc.nextLine();
        String hoten1 = sc.nextLine();
        double dlt1 = sc.nextDouble();
        double dth1 = sc.nextDouble();
        sc.nextLine();
        String msv2 = sc.nextLine();
        String hoten2 = sc.nextLine();
        double dlt2 = sc.nextDouble();
        double dth2 = sc.nextDouble();
        sc.nextLine();

        sinhvien sv1 = new sinhvien(msv1, hoten1, dlt1, dth1);

        sv1.thongtinsv();
        sv1.ghifile(hoten1);

        sinhvien svm = new sinhvien(msv2, hoten2, dlt2, dth2);

        System.out.println("DANG GHI FILE!>>>");
        svm.ghifile(hoten2);// Ghi vao file
        sinhvien sv2 = new sinhvien();
        System.out.println("DANG DOC FILE!>>>");
        sv2.doctufile(hoten2);// doc tu file
        sv2.thongtinsv();
    }
}