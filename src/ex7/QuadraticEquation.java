package ex7;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
       return b*b - 4*a*c;
    }

    public boolean hasRealRoots(){
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (hasRealRoots()) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }else{
            return Double.NaN;
        }
    }

    public double getRoot2() {
        if (hasRealRoots()) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }else{
            return Double.NaN;
        }
    }
    public void display() {
        if (hasRealRoots()) {
            System.out.println("pt co 2 no phan biet:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else {
            System.out.println("pt vo no");
        }
    }
}
