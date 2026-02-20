package bai12;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        artist as = new artist();
        System.out.print("dien chieu dai: ");
        boolean kt = false;
        int cd = sc.nextInt();
        while (kt == false) {
            if (cd >= 1 && cd <= 15) {
                kt = true;
            } else {
                System.out.print("cd phai nam trong [1;15]: ");
                cd = sc.nextInt();
            }
        }

        System.out.print("dien chieu rong: ");
        int cr = sc.nextInt();
        while (kt == true) {
            if (cr >= 1 && cr <= 15) {
                kt = false;
            } else {
                System.out.print("cr phai nam trong [1;15]: ");
                cr = sc.nextInt();
            }
        }

        System.out.print("dien canh vuong: ");
        int cv = sc.nextInt();
        while (kt == false) {
            if (cv >= 1 && cv <= 20) {
                kt = true;
            } else {
                System.out.print("cv phai nam trong [1;20]: ");
                cv = sc.nextInt();
            }
        }

        shape shape;
        System.out.println("hinh chu nhat!");
        shape = new rectangle(cd, cr);
        as.drawshape(shape);
        System.out.println("hinh tam giac vuong!");
        shape = new righttriangle(cv);
        as.drawshape(shape);
    }
}