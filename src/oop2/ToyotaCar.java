package oop2;

public class ToyotaCar extends AbstractCar implements Fix{

    public ToyotaCar(int mass, String colour, int age) {
        super(mass, colour, age);
    }

    @Override
    public void ride() {
        System.out.println("Ride careful");
    }

    @Override
    public int fix() {
        return 1000 * 2 * getAge()/2;
    }
}
