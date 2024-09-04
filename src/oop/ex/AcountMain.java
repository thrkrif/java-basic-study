package oop.ex;

public class AcountMain {
    public static void main(String[] args) {
        Acount my = new Acount();
        my.deposit(10000);
        my.withdraw(9000);
        my.withdraw(2000);
        System.out.println("잔고: " + my.balance);

    }
}
