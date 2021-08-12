package oop2;

public class BmwCar extends AbstractCar{

    public BmwCar(int mass, String colour, int age) {
        super(mass, colour, age);
    }

    @Override
    public void ride() {
        System.out.println("Ride very fast");
    }
}
