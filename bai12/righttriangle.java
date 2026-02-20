package bai12;

public class righttriangle extends shape {
    private int cv;

    public righttriangle(int cv) {
        super();
        this.cv = cv;
    }

    public int getcv() {
        return this.cv;
    }

    public void setcv(int cv) {
        if (cv >= 1 && cv <= 20) {
            this.cv = cv;
        } else {
            System.out.println("cv phai nam trong khoang [1;20]");
        }
    }

    @Override
    public void draw() {
        for (int i = 1; i <= cv; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
