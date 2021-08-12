package incaps;

import oop.Employee;

public class Car {
     protected int speed;
//    public;
//    protected;
//
//    ;
//    private;

    protected void ride(){
        System.out.println("Ride");
    }

    public void fastRide(){
        System.out.println("Fast");
        ride();
    }

    public void ride(Employee employee){
        System.out.println("Ride with employee" + employee);
    }
}
