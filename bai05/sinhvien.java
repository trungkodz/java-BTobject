package bai05;

public class sinhvien {
    private String msv, hoten;
    private double dlt, dth;

    public sinhvien(String msv, String hoten, double dlt, double dth) {
        this.msv = msv;
        this.hoten = hoten;
        this.dlt = dlt;
        this.dth = dth;

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

        System.out.println("ket qua hoc tap:  " + ketqua() + " diem tb: " + dtb());
    }
}
