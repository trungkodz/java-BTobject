package bai03;

import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;

public class bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maNV1 = sc.nextLine();
        int soSP1 = sc.nextInt();
        sc.nextLine();
        String maNV2 = sc.nextLine();
        int soSP2 = sc.nextInt();
        nhanvien nv1 = new nhanvien(maNV1, soSP1);
        nhanvien nv2 = new nhanvien(maNV2, soSP2);

        nhanvien.xuattieude();
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}