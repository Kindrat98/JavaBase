package oop;

public class AMain {
    public static void main(String[] args) {
//        Object a = new A();
        Object b = new B();
        C c = new C();
        print(b, c);
    }

    public static void print(Object object1, Object object2){
        if (object1 instanceof A){
            ((A) object1).print();
        }
        if (object2 instanceof B){
            ((B) object2).print();
        }
    }
}
