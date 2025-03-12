package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.printf("Hinh tron mac dinh: ");
        circle1.display();

        Scanner sc = new Scanner(System.in);
        System.out.printf("\nNhap vao ban kinh hinh tron");
        Circle circle2 = new Circle(sc.nextDouble());
        System.out.printf("Hinh tron sau khi nhap: ");
        circle2.display();
    }
}
