package part1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("lexus", 120);
        Car car1 = car;
        car.speed = 100;
        Car car2 = new Car("lexus", 120);
        System.out.println(car == car1);
        System.out.println(car == car2);
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
    }

    public static void print(Car car){
        System.out.println(car.toString());
        car.speed = 130;
    }
}
