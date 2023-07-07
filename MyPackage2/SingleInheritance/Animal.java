package MyPackage2.SingleInheritance; //  SINGLE INHERITACNCE

public class Animal {
    void eat(){
        System.out.println("hey ");
    }
}
class Dog extends Animal{
    public static void main(String[] args){
        Dog dog= new Dog();
        dog.eat();
    }

}