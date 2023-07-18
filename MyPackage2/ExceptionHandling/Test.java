package MyPackage2.ExceptionHandling;
public class Test {
    public static void main (String args []){
        System.out.println(1);
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println("exception");
            System.out.println(e);
        }
        System.out.println(0/100);
    }
}
