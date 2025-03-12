package ex3;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return (this.width + this.length)*2;
    }

    public void display(
    ){
        System.out.printf("Dien tich hinh chu nhat: %f \n", this.getArea());
        System.out.printf("Chu vi hinh chu nhat: %f \n", this.getPerimeter());
        System.out.printf("Chieu dai hinh chu nhat: %f \n", this.length);
        System.out.printf("Chieu rong hcn: %f",this.width);
    }
}
