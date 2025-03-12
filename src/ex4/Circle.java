package ex4;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public void display() {
        System.out.printf("\nBan kinh: "+this.radius);
        System.out.printf("\nDien tich hinh tron: "+this.getArea());
        System.out.printf("\nChu vi hinh tron: " +this.getPerimeter());
    }
}
