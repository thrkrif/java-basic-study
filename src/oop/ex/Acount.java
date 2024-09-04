package oop.ex;

public class Acount {
    int balance;
    void deposit(int amount){
        balance += amount;
        System.out.println("계좌 잔액: " + balance);
    }

    void withdraw(int amount){
        if(balance - amount >= 0) {
            balance -= amount;
            System.out.println("계좌 잔액: " + balance);
        }
        else{
            System.out.println("잔액이 부족합니다.");
        }
    }
}
