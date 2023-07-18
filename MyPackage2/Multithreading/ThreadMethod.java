package MyPackage2.Multithreading;

 class Th4 extends Thread{
    public void run(){
        System.out.println("dtrfyryhjn");
    }
}
class Th5 extends Thread{
    public void run(){
        System.out.println("fcgvhbjn");
    }
}

public class ThreadMethod {
    public static void main(String args[]) throws InterruptedException {
        Th4 th4 = new Th4();
        Th5 th5 = new Th5();
        th4.start();
        th4.join();
        th5.start();

    }

}
