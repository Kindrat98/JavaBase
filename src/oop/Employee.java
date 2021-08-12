package oop;

import incaps.Car;

public class Employee {
    private String myName;
    private String lastName;
    private int age;
    private int experience;
    private int salary;

    public Employee(){
    }

    public Employee(String myName, String lastName, int age, int experience, int salary) {
        this.myName = myName;
        this.lastName = lastName;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + myName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                ", experience=" + experience +
//                ", salary=" + salary +
//                '}';
//    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return this;
    }

    public void ride(Car car){
        car.ride(this);
    }
}
