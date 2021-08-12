package oop2;

public abstract class AbstractCar {

    private int mass;
    private String colour;
    private int age;

    public abstract void ride();

    public AbstractCar(int mass, String colour, int age) {
        this.mass = mass;
        this.colour = colour;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
