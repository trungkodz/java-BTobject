package bai04;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.lang.Math;

public class bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ho1, ten1, ho2, ten2;
        int sp1, sp2;
        ho1 = sc.nextLine();
        ten1 = sc.nextLine();
        sp1 = sc.nextInt();
        sc.nextLine();
        ho2 = sc.nextLine();
        ten2 = sc.nextLine();
        sp2 = sc.nextInt();
        cnhanvien nv1 = new cnhanvien(ho1, ten1, sp1);
        cnhanvien nv2 = new cnhanvien(ho2, ten2, sp2);

        System.out.println("luong nv1: " + nv1.getluong());
        System.out.println("luong nv2: " + nv2.getluong());
        if (nv1.nhieuhon(nv2) == true) {
            System.out.println("nv1 nhieu sp hon nv2: " + (nv1.getmSoSP() - nv2.getmSoSP()) + " sp.");
        } else {
            System.out.println("nv2 nhieu sp hon nv1: " + (nv2.getmSoSP() - nv1.getmSoSP()) + " sp.");
        }

        System.out.println("so sanh cach 2: ");

        if (nv1.getmSoSP() > nv2.getmSoSP()) {
            System.out.println("nv1 nhieu sp hon nv2: " + (nv1.getmSoSP() - nv2.getmSoSP()) + " sp.");
        } else {
            System.out.println("nv2 nhieu sp hon nv1: " + (nv2.getmSoSP() - nv1.getmSoSP()) + " sp.");
        }
    }
}