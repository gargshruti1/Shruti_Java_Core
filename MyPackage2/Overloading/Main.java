package MyPackage2.Overloading;// main class

import MyPackage2.Overriding.Person;

public class Main {
    public static void main (String[] args){
        Person person=new Person();// can change during runtime can be Emp or can be showDetail
        person.showDetail( );
    }
}
