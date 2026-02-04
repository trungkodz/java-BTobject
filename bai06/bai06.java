package bai06;

import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;

public class bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanvien[] nv = new nhanvien[4];
        for (int i = 0; i < 4; i++) {
            long a = sc.nextLong();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            boolean d = false;
            boolean kiemtra = false;
            while (kiemtra == false) {
                try {
                    System.out.println("day co phai la ql (true/false): ");
                    d = sc.nextBoolean();

                    kiemtra = true;
                } catch (Exception e) {
                    System.out.println("loi: chi dc nhap true/false hay nhap lai! ");
                    sc.nextLine();
                }
            }

            nv[i] = new nhanvien(a, b, c, d);
        }
        System.out.println("day la danh sach quan ly");
        for (int i = 0; i < 4; i++) {
            if (nv[i].cbql() == true) {
                nv[i].dsnv();
            }
        }
    }

}