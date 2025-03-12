package ex5;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1.0, 2.0);
        Vector2D v2 = new Vector2D(3.0, 4.0);

        System.out.println("Vector v1:");
        v1.displayVector();
        System.out.println("Vector v2:");
        v2.displayVector();

        System.out.printf("\nDo dai cua v1: %f\n", v1.calculateMagnitude());
        System.out.printf("Do dai cua v2: %f\n", v2.calculateMagnitude());

        Vector2D sumVector = v1.add(v2);
        System.out.println("\nTong 2 vector:");
        sumVector.displayVector();

        Vector2D diffVector = v1.subtract(v2);
        System.out.println("\nHieu 2 vector:");
        diffVector.displayVector();

        System.out.printf("\nTich vo huong giua v1 va v2: %f\n", v1.dotProduct(v2));
    }
}
