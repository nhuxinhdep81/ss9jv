package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("hcn mac dinh:");
        rec1.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap vao chieu dai va chieu rong: ");
        Rectangle rec2 = new Rectangle(sc.nextDouble(),sc.nextDouble());
        System.out.println("hcn sau khi nhap:");
        rec2.display();
    }
}
