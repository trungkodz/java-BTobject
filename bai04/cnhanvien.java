package bai04;

public class cnhanvien {
    private String mHo, mTen;
    private int mSoSP;

    public cnhanvien(String mHo, String mTen, int mSoSP) {
        this.mHo = mHo;
        this.mTen = mTen;
        if (mSoSP >= 0) {
            this.mSoSP = mSoSP;
        } else {
            this.mSoSP = 0;
        }
    }

    public String getmHo() {
        return this.mHo;
    }

    public String getmTen() {
        return this.mTen;
    }

    public int getmSoSP() {
        return this.mSoSP;
    }

    public void setmHo(String ho) {
        this.mHo = ho;
    }

    public void setmTen(String ten) {
        this.mTen = ten;
    }

    public void setmSoSP(int sp) {
        if (sp >= 0) {
            this.mSoSP = sp;
        } else {
            this.mSoSP = 0;
        }
    }

    public double getluong() {
        if ((double) this.mSoSP >= 1.0 && (double) this.mSoSP <= 199.0) {
            return (double) this.mSoSP * 0.5;
        } else if ((double) this.mSoSP >= 200.0 && (double) this.mSoSP <= 399.0) {
            return ((double) this.mSoSP - 199.0) * 0.55 + (199.0 * 0.5);
        } else if ((double) this.mSoSP >= 400.0 && (double) this.mSoSP <= 599.0) {
            return ((double) this.mSoSP - 399) * 0.6 + (((double) this.mSoSP - 199.0) * 0.55 + (199.0 * 0.5));
        } else {
            return ((double) this.mSoSP - 599) * 0.65
                    + (((double) this.mSoSP - 399) * 0.6 + (((double) this.mSoSP - 199.0) * 0.55 + (199.0 * 0.5)));
        }

    }

    public boolean nhieuhon(cnhanvien nv2) {
        if (this.mSoSP > nv2.getmSoSP()) {
            return true;
        } else {
            return false;
        }
    }


}
