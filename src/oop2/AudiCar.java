package oop2;

public class AudiCar extends AbstractCar implements Fix{

    public AudiCar(int mass, String colour, int age) {
        super(mass, colour, age);
    }

    @Override
    public void ride() {
        System.out.println("Ride fast");
    }

    @Override
    public int fix() {
        return 1000 * 4 * getAge();
    }
}
