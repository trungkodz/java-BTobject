package bai05;

import java.io.*;
import java.util.Scanner;

public class sinhvien {
    private String msv, hoten;
    private double dlt, dth;

    public sinhvien() {

    }

    public sinhvien(String msv, String hoten, double dlt, double dth) {
        this.msv = msv;
        this.hoten = hoten;
        this.dlt = dlt;
        this.dth = dth;

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.msv = sc.nextLine();
        this.hoten = sc.nextLine();
        this.dlt = sc.nextDouble();
        this.dth = sc.nextDouble();
    }

    public double dtb() {
        return (this.dlt + this.dth) / 2;
    }

    public String ketqua() {
        if (dtb() >= 5) {
            return "do";
        } else {
            return "truot";
        }
    }

    public void thongtinsv() {
        System.out.println("msv: " + this.msv);
        System.out.println("hoten: " + this.hoten);
        System.out.println("dlt: " + this.dlt);
        System.out.println("dth: " + this.dth);

        System.out.println("ket qua hoc tap: " + ketqua() + " diem tb: " + dtb());
    }

    // hàm ghi thông tin đối tượng hiện tại vào file
    public void ghifile(String tenfile) {
        try {
            FileWriter fw = new FileWriter(tenfile);
            BufferedWriter bw = new BufferedWriter(fw);
            // ghi vào file
            bw.write(this.msv);
            bw.newLine();// xuống dòng
            bw.write(this.hoten);
            bw.newLine();
            bw.write(String.valueOf(this.dlt));
            bw.newLine();
            bw.write(String.valueOf(this.dth));

            bw.close(); // phải đóng file mới lưu dữ liệu
            System.out.println("du lieu da in vao " + tenfile + " thanh cong!");
        } catch (IOException e) {
            System.out.println("loi khi ghi file: " + e.getMessage());
        }

    }

    public void doctufile(String tenfile) {
        try {
            File f = new File(tenfile);
            if (!f.exists()) {
                System.out.println("file ko ton tai!");
                return;
            }

            Scanner sc = new Scanner(f);

            if (sc.hasNextLine()) {
                this.msv = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                this.hoten = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                this.dlt = Double.parseDouble(sc.nextLine());
            }
            if (sc.hasNextLine()) {
                this.dth = Double.parseDouble(sc.nextLine());
            }
            sc.close();
            System.out.println("doc du lieu thanh cong! ");

        } catch (Exception e) {
            System.out.println("ko doc dc file: " + e.getMessage());
        }
    }
}
