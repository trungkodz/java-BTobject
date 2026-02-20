package bai13;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this.dateCreated = new Date();
        this.color = "white";
        this.filled = true;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "color: " + this.color + "\n" + "fulled: " + isFilled() + "\n" + "date: " + this.dateCreated + "\n";
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
