package ex6;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1.0,2.0);
        Point2D p2 = new Point2D(3.0,4.0);

        double sum = p1.distanceTo(p2);
        System.out.println("khoang cach giua 2 diem: "+sum);

        // cap nhat lai toa do cua point1
        p1.setX(5.0);
        p1.setY(6.0);

        p1.displayVector();
    }
}
