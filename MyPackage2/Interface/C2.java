package MyPackage2.Interface;

public class C2 implements I3 {

    @Override
    public void start() {
        System.out.println("displays C2");
    }

    public static void main(String[] args) {

        C2 c2 = new C2();
        c2.start();
    }
}
