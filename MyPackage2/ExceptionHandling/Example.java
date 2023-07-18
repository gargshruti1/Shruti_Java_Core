package MyPackage2.ExceptionHandling;
import java.io.IOException;
public class Example {
    public static void main(String[] args) throws ArithmeticException {
        method();
    }
    public static void method() throws ArithmeticException {
        throw new ArithmeticException("exception occurs");
    }
}
