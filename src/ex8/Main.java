package ex8;

public class Main {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("28072005", "Le dien tien", 1000000);
        BankAccount user2 = new BankAccount("25032000", "Le dien manh", 50000);

        System.out.println("so tien ban dau:");
        user1.display();
        user2.display();

        System.out.println("nap tien vao tk 1:");
        user1.deposit(2807);
        user1.display();

        System.out.println("rut tien tk 1:");
        user1.withdraw(8683);
        user1.display();

        System.out.println("chuyen tien tu 1 sang 2:");
        user1.transfer(user2, 3000);
        user1.display();
        user2.display();
    }

}
