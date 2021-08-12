package oop2;

public class Person {
    private int money;

    public Person(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "money=" + money +
                '}';
    }
}
