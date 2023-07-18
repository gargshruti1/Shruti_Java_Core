package MyPackage2.Multithreading;

 class Mythread1 extends Thread{
    public void run(){
        System.out.println("hihdihed");
    }
}
class Mythread2 extends Thread{
     public void run(){
         System.out.println("dnjendk");
     }
}
public class Multithreading1{
     public static void main(String args[]){
         Mythread1 mythread1 = new Mythread1();
         Mythread2 mythread2 = new Mythread2();
         mythread2.start();
         mythread1.start();
     }
}