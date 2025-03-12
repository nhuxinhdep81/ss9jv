package ex5;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateMagnitude(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void add(Vector2D v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void subtract(Vector2D v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public double dotProduct(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    public void displayVector() {
        System.out.printf("(%f, %f)\n", this.x, this.y);
    }
}
