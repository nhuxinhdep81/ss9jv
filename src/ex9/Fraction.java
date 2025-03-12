package ex9;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.printf("Mau so phai khac 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public Fraction add(Fraction other) {
        return new Fraction(this.numerator * other.denominator + other.numerator * this.denominator
                         , this.denominator * other.denominator);
    }
    public Fraction subtract(Fraction other) {
        return new Fraction(this.numerator * other.denominator - other.numerator * this.denominator
                            , this.denominator * other.denominator);
    }
    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator
                            , this.denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            System.out.printf("mau phai khac 0");
        }
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    private void simplify() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }
    private int findGCD(int a, int b) {
        return (b == 0) ? Math.abs(a) : findGCD(b, a % b);
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
}

