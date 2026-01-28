package bai02;

import java.lang.Math;

public class hinhtamgiac {
    private int ma, mb, mc;

    public hinhtamgiac() {
        this.ma = 0;
        this.ma = 0;
        this.ma = 0;
    }

    public hinhtamgiac(int ma, int mb, int mc) {

        if (ma < 0) {
            System.out.println("a ko dc la so am");
            this.ma = 0;
        } else if (mb < 0) {
            System.out.println("b ko dc la so am");
            this.mb = 0;
        } else if (mc < 0) {
            System.out.println("c ko dc la so am");
            this.mc = 0;
        }
        if ((ma + mb) <= mc || (ma + mc) <= mb || (mb + mc) <= ma) {
            System.out.println("day ko phai la hinh tam giac");
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public int getcanhA() {
        return this.ma;
    }

    public int getcanhB() {
        return this.mb;
    }

    public int getcanhC() {
        return this.mc;
    }

    public void setcanhA(int a) {
        if (a < 0 && ((ma + mb) <= mc || (ma + mc) <= mb || (mb + mc) <= ma)) {
            System.out.println("day ko phai la tam giac ");
        } else {
            this.ma = a; // ma = a cung dc vi tham so va thuoc tinh ko giong nhau
        }
    }

    public void setcanhB(int b) {
        if (b < 0 && ((ma + mb) <= mc || (ma + mc) <= mb || (mb + mc) <= ma)) {
            System.out.println("day ko phai la tam giac ");
        } else {
            this.mb = b; // ma = a cung dc vi tham so va thuoc tinh ko giong nhau
        }
    }

    public void setcanhC(int c) {
        if (c < 0 && ((ma + mb) <= mc || (ma + mc) <= mb || (mb + mc) <= ma)) {
            System.out.println("day ko phai la tam giac ");
        } else {
            this.mc = c; // ma = a cung dc vi tham so va thuoc tinh ko giong nhau
        }
    }

    public boolean latamgiac() {
        if (((ma + mb) <= mc || (ma + mc) <= mb || (mb + mc) <= ma)) {
            return false;
        } else {
            return true;
        }
    }

    public int getchuvi() {

        return ma + mb + mc;
    }

    public double getdientich() {
        double p = (ma + mb + mc) / 2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }
}
