package bai03;

public class nhanvien {
    private String maNV;
    private int soSP;

    public nhanvien() {
        this.maNV = "0";
        this.soSP = 0;
    }

    public nhanvien(String maNV, int soSP) {
        if (soSP > 0) {
            this.maNV = maNV;
            this.soSP = soSP;
        } else {
            this.maNV = "0";
            this.soSP = 0;
        }
    }

    public String getMaNV() {
        return this.maNV;
    }

    public int getsoSP() {
        return this.soSP;
    }

    public void setMaNV(String ma) {
        this.maNV = ma;
    }

    public void setSoSP(int sp) {
        if (sp > 0) {
            this.soSP = sp;
        } else {
            this.soSP = 0;
        }
    }

    public boolean covuatchuan() {
        if (this.soSP > 500) {
            return true;
        } else {
            return false;
        }

    }

    public String gettongket() {
        if (covuatchuan() == true) {
            return "vuot";
        } else {
            return "";
        }
    }

    public double getluong() {
        if (covuatchuan() == false) {
            return soSP * 200;
        } else {
            return ((soSP - 500) * 300) + (soSP * 200); // giảm bớt 2 số 0 cho số đỡ to
        }

    }

    public static void xuattieude() {
        System.out.printf("%-10s %-15s %-15s %-15s %n",
                "Ma NV", "So SP", "Luong", "Tong Ket");
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15d %-15.0f %-15s", this.maNV, this.soSP, getluong(), gettongket());
    }
}
