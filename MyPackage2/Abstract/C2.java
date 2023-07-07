package MyPackage2.Abstract;

public class C2 extends C1 {
    public void start() {
        System.out.println("displays");
    }
    public static void main (String args[]){
        C2 c2 = new C2();
        c2.display();
    }

}
