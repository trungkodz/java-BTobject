package bai12;

public class rectangle extends shape {
    private int cd, cr;

    public rectangle(int cd, int cr) {
        super();
        setcd(cd);
        setcr(cr);
    }

    public int getcd() {
        return this.cd;
    }

    public int getcr() {
        return this.cr;
    }

    public void setcd(int cd) {
        if (cd >= 1 && cd <= 15) {
            this.cd = cd;
        } else {
            System.out.println("cd nam trong khoang [1;15]");

        }

    }

    public void setcr(int cr) {
        if (cr >= 1 && cr <= 15) {
            this.cr = cr;
        } else {
            System.out.println("cr nam trong khoan [1;15");
        }
    }

    @Override
    public void draw() {
        for (int i = 1; i <= cr; i++) {
            for (int j = 1; j <= cd; j++) {
                if (i == 1 || i == cr || j == 1 || j == cd) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
