package myTasks.task04.atm;

public class ATM {
    private double balance;

    public ATM() {
        balance = 1000; // Başlangıç bakiyesi
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Yatırılan miktar: " + amount + " TL");
        System.out.println("Yeni bakiye: " + balance + " TL");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Çekilen miktar: " + amount + " TL");
            System.out.println("Yeni bakiye: " + balance + " TL");
        } else {
            System.out.println("Yetersiz bakiye. Çekim işlemi gerçekleştirilemedi.");
        }
    }

    public void checkBalance() {
        System.out.println("Mevcut bakiye: " + balance + " TL");
    }
}