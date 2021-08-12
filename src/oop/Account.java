package oop;

public class Account extends Object{
    private String number;
    private String owner;
    private double uah;
    private double usd;
    public static double usdToUahCurrency = 27.0;
    public static int accountsCounter = 0;

    public static int getAccountsCounter(){
        return accountsCounter;
    }

    public void changeAllUsdToUah(){
        uah += usd * usdToUahCurrency;
        usd = 0;
    }

    public Account() {
        accountsCounter ++;
    }

    @Override
    public String toString() {
        return "Account[" +
                "number = '" + number + '\'' +
                ", owner = '" + owner + '\'' +
                ", uah = " + uah +
                ", usd = " + usd +
                ']';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getUah() {
        return uah;
    }

    public void setUah(double uah) {
        this.uah = uah;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public Account(String number, String owner, double uah, double usd) {
        this.number = number;
        this.owner = owner;
        this.uah = uah;
        this.usd = usd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Account)) {
            return false;
        }

        Account account = (Account) o;

        if (Double.compare(account.uah, uah) != 0) return false;
        if (Double.compare(account.usd, usd) != 0) return false;
        if (number != null ? !number.equals(account.number) : account.number != null) return false;
        return owner != null ? owner.equals(account.owner) : account.owner == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = number != null ? number.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        temp = Double.doubleToLongBits(uah);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(usd);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
