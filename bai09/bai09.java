package bai09;

import java.util.Scanner;
import java.util.random.*;
import bai03.nhanvien;

public class bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        danhsachnhanvien ds = new danhsachnhanvien();
        System.out.print("nhap so nhan vien muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap ma nv cua ban: ");
            String manv = sc.nextLine();
            System.out.print("nhap ma so sp cua ban: ");
            int sosp = sc.nextInt();
            sc.nextLine();
            nhanvien nv = new nhanvien(manv, sosp);
            ds.addnv(nv);
        }

        System.out.println("thong tin nv! ");
        ds.thongtinnv();

        System.out.println("tong nv hien co: " + ds.tongnv());

        System.out.println("thong tin nv vuot chuan!");
        ds.nvvuotchuan();

        System.out.println("so nv ko dat chuan: " + ds.nvkodatchuan());

        System.out.println("tong luong nv dat chuan: " + ds.tongluongnvdatchuan());

        System.out.println("nhan vien co so sp it nhat: ");
        nhanvien.xuattieude();
        System.out.println(ds.nvcospmin());

        System.out.println("nhan vien luong cao nhat: ");
        nhanvien.xuattieude();
        System.out.println(ds.nvluongmax());

        System.out.println("nhan vien ko dat chuan co luong max: ");
        nhanvien.xuattieude();
        System.out.println(ds.nvkodatcoluongmax());

        System.out.println("tong luong nv: " + ds.tongluong());

        System.out.print("ban muon tim thong tin nv nao: ");
        String manv = sc.nextLine();
        nhanvien.xuattieude();
        ds.timkiem2(manv);

        System.out.println("mang nv sau khi sap sep!");
        nhanvien.xuattieude();
        ds.sapxep();

        System.out.print("ban muon xoa nv nao, vui long nhap manv: ");
        String manv1 = sc.nextLine();
        ds.xoa(manv1);

        System.out.println("thong tin nv sau khi xoa! ");
        ds.thongtinnv();
    }
}
