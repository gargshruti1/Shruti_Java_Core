package MyPackage2.ExceptionHandling;

public class Example1 {
        public static void main(String[] args) throws ArithmeticException {
            System.out.println(method());
        }
        public static int method() throws ArithmeticException {
            int sum = 5/0;
            return sum;
        }
    }


