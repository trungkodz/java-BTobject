package bai08;

import java.util.Arrays;

public class CircleCollection {
    private Circle[] hinhtron;

    public CircleCollection() {
        this.hinhtron = new Circle[0];
    }

    public void addCircle(Circle a) {
        this.hinhtron = Arrays.copyOf(this.hinhtron, this.hinhtron.length + 1);
        this.hinhtron[this.hinhtron.length - 1] = a;
    }

    public int getSize() {
        return (this.hinhtron.length);
    }

    public Circle getCircle(int getc) {
        if (getc >= 0 && getc < this.hinhtron.length) {
            return this.hinhtron[getc];
        } else {
            return null;
        }
    }

    public Circle setCircle(int setc, Circle a) {
        if (setc >= 0 && setc < this.hinhtron.length) {
            return this.hinhtron[setc] = a;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < this.hinhtron.length; i++) {
            s += "hinh " + (i + 1) + ": " + "\n" + hinhtron[i].toString() + "\n";
        }
        return s;
    }

    public double tong() {
        double tong = 0;
        for (int i = 0; i < this.hinhtron.length; i++) {
            tong += hinhtron[i].Area();
        }
        return tong;
    }

    public double max() {
        double max = hinhtron[0].Area();
        for (int i = 0; i < this.hinhtron.length; i++) {
            if (hinhtron[i].Area() > max) {
                max = hinhtron[i].Area();
            }
        }
        return max;
    }

    public double min() {
        double min = hinhtron[0].Area();
        for (int i = 0; i < this.hinhtron.length; i++) {
            if (hinhtron[i].Area() < min) {
                min = hinhtron[i].Area();
            }
        }
        return min;

    }

    public Circle min1() {
        Circle min = hinhtron[0];
        for (int i = 0; i < this.hinhtron.length; i++) {
            if (hinhtron[i].Area() < min.Area()) {
                min = hinhtron[i];
            }
        }
        return min;
    }
}
