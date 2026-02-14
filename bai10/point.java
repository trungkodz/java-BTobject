package bai10;

public class point {
    private int x;
    private int y;

    public point() {
    }

    public point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

    @Override

    public String toString() {
        return "x = " + this.x + "\n" + "y = " + this.y + "\n";
    }
}
