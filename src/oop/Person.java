package oop;

public class Person {
    private int age;
    private String firstName;
    private String lastName;
    private String male;

    public Person(int age, String firstName, String lastName, String male) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.male = male;
    }

    public Person() {
    }

    public void sleep(int hours){
        System.out.println("Sleep hours = " + hours);
    }

    private void f(){

    }
}
