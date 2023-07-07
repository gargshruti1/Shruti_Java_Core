package MyPackage2.Interface;

public class C1 implements I3 {

    @Override
    public void start() {
        System.out.println(" displays ");

    }
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.start();
    }
}

