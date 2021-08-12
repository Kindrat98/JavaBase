package oop;

public class Student extends Person{
    int course;
    String university;
    String groupName;
    int stypedia;

    public Student(int age, String firstName, String lastName, String male, int course, String university, String groupName, int stypedia) {
        super(age, firstName, lastName, male);
        this.course = course;
        this.university = university;
        this.groupName = groupName;
        this.stypedia = stypedia;
    }

    public Student (){
    }

    @Override
    public void sleep(int hours) {
        super.sleep(hours - 1);
    }

    public void learn(){
        System.out.println("Learn");
    }
}
