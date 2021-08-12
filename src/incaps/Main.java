package incaps;

import oop.CarMain;
import oop.Employee;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.speed = 100;
//        car.ride();
        Car car = new Car();
        Employee employee = new Employee();
        System.out.println(employee);
        employee.ride(car);
    }
}
