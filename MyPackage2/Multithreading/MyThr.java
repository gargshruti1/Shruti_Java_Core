package MyPackage2.Multithreading;
class Th extends Thread{
    public Th(String name){
        super(name);
    }
    public void run(){
            System.out.println("esrdtrfuj");

    }
}
public class MyThr {
    public static void main(String args[]){
        Th th= new Th("Shruti1");
        Th th1= new Th("Shruti2");
        Th th2= new Th("Shruti3");
        Th th3= new Th("Shruti4");
        Th th4= new Th("Shruti5");
        th4.setPriority(Thread.MAX_PRIORITY);
        th.start();
        th2.start();
        th1.start();
        th3.start();
        th4.start();

        System.out.println(th.getId());
        System.out.println(th.getPriority());
        System.out.println(th.getName());
        System.out.println(th.getState());
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        System.out.println(th3.getPriority());
        System.out.println(th4.getPriority());

    }
}
