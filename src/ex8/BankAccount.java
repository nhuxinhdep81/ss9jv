package ex8;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("nap tien khong thanh cong");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Khong du tien rut");
        } else if (amount > 0) {
            balance -= amount;
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
        } else {
            System.out.println("Ck khong thanh cong");
        }
    }
    public void display() {
        System.out.println("So tk: " + accountNumber);
        System.out.println("Chu tk: " + accountHolder);
        System.out.println("So du: " + balance);
    }
}
