package ex9;


public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 8);
        Fraction f2 = new Fraction(2, 5);

        System.out.printf("cong 2 ps: "+f1.add(f2)); ;
        System.out.printf("\ntru 2 ps: "+f1.subtract(f2));
        System.out.printf("\nnhan 2 ps: "+f1.multiply(f2));
        System.out.printf("\nchia 2 ps: "+f1.divide(f2));
        System.out.printf("\nchuyen doi ps1: "+f1.toString());
    }
}

