package bai07;

public class student {
    private String fn, ln;
    private address ha, sa;

    public student(String fn, String ln, address ha, address sa) {
        this.fn = fn;
        this.ln = ln;
        this.ha = ha;
        this.sa = sa;
    }

    @Override
    public String toString() {
        String kq = "";
        kq = kq + "ten: " + ln + " " + fn + "\n";
        kq = kq + "truong: " + sa.toString() + "\n";
        kq = kq + "nha: " + ha.toString();

        return kq;
    }
}
