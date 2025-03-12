package ex2;

public class main {
    public static void main(String[] args) {
        Employment employ1 = new Employment("NV001", "Le Dien Tien", "Giam Doc", 1000);

        employ1.displayInfo();

        System.out.println("/n");

        employ1.updateSalary(20);

        employ1.displayInfo();

    }
}
