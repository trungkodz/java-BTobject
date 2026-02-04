package bai06;

public class nhanvien {
    private long maNV;
    private String hoten, diatri;
    private boolean ql;

    public nhanvien() {

    }

    public nhanvien(long maNV, String hoten, String diatri, boolean ql) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.diatri = diatri;
        this.ql = ql;
    }

    public boolean cbql() {
        return this.ql;
    }

    public void dsnv() {
        System.out.println("ten: " + this.hoten);
        System.out.println("maNV: " + this.maNV);
        System.out.println("dia tri: " + this.diatri);
        System.out.println("===========================================");

    }
}
