package oop;

public class AccountMain {
    public static void main(String[] args) {
        Account account0 = new Account("123", "Oleh", 100, 10);
        Account account1 = new Account("123", "Oleh", 100, 10);
        Account account2 = new Account("123", "Ivan", 100, 1000000);
        System.out.println(account0);
        System.out.println(account1);
        System.out.println(account2);
//        System.out.println(account0.equals(account1));
//        System.out.println(account0 == account1);
        System.out.println(account0.hashCode());
        System.out.println(account1.hashCode());
        System.out.println(account2.hashCode());
    }
}
