package MyPackage2.ExceptionHandling;
public class a {
    public static void main(String args []) {
        System.out.println("start");
        int result = 0;

        try {
            int n1 = 0;
            int n2 = 100;
            System.out.println("2no.");
            result = n1 / n2;
        } catch (Exception e) {
            System.out.println("n2=!0");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("hey finally");
        }
        System.out.println(result);
        System.out.println("terminate");
    }
}
