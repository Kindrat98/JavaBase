package oop2;

public class FixService {

    public void fix(Person owner, Fix car) {
        int sum = car.fix();
        owner.setMoney(owner.getMoney() - sum);
    }
}
