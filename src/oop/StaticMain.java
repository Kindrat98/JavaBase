package oop;


public class StaticMain {
    public static void main(String[] args) {
        Account account0 = new Account();
        account0.setUsd(10);
        account0.setUah(100);
        System.out.println(account0);
        account0.changeAllUsdToUah();
        System.out.println(account0);

//        System.out.println(Account.usdToUahCurrency);
//        System.out.println(Account.usdToUahCurrency);
//        account1.usdToUahCurrency = 28;
//        System.out.println(account2.usdToUahCurrency);
//        System.out.println(Account.usdToUahCurrency);
//        System.out.println(Account.usdToUahCurrency);
        AccountHelper.changeCurrency(28.0);
//        System.out.println(Account.usdToUahCurrency);
//        System.out.println(Account.getAccountsCounter());

    }
}
