package day41;

import java.time.LocalDate;

public class AccountHolder {

    int membershipYear;
    private String name;

    double balance;

    private String city;

    private int birthYear;

    private int age;

    AccountHolder(double deposit) {
        this.balance = deposit;
    }

    AccountHolder() {

    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBirthYear(int birthYear) {
        LocalDate localDate = LocalDate.now();
//        this.age = 2024 - birthYear;
        this.age = localDate.getYear() - birthYear;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return this.getBirthYear();
    }


    public int getAge() {
        return this.age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void putMoneyIntoAccount(double money) {
//        balance = balance + money;
        balance += money;
    }

    public void withdrawMoney(double money) {
        //20000
        balance = balance - money;
    }
}
