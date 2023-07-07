package MyPackage2.Abstraction;//abstraction
abstract class Vehicle {
    abstract void start();
}
class  Car extends Vehicle{
    @Override
    void start() {
        System.out.println("car starts with key");
    }
}
class Scooter extends Vehicle{
    @Override
    void start() {
        System.out.println("Scooter starts with kick");
    }
    public static void main(String [] args){
        Car car= new Car();
        car.start();
        Scooter scooter= new Scooter();
        scooter.start();
    }

}

