package oop2;

public class AMain {
    public static void main(String[] args) {
        AudiCar audiCar = new AudiCar(2000, "blue ocean", 2);
        ToyotaCar toyotaCar = new ToyotaCar(1900, "space grey", 1);
        BmwCar bmwCar = new BmwCar(3000, "mint", 0);

        audiCar.ride();
        toyotaCar.ride();
        bmwCar.ride();

        Person oleh = new Person(100000);
        Person ivan = new Person(100000);
        Person anton = new Person(100000);

        FixService service = new FixService();

        Iphone iphone = new Iphone();
        service.fix(oleh, audiCar);
        System.out.println(oleh);
        service.fix(ivan, toyotaCar);
        System.out.println(ivan);
        service.fix(anton, iphone);
        System.out.println(anton);
    }
}
