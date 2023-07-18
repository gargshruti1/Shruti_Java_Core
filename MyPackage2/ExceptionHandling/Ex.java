package MyPackage2.ExceptionHandling;

public class Ex {

    public static void main(String args[]) {
        System.out.println("finally");
    }

    void method () throws ArithmeticException{
        int age = 0;
        if (age <17){
            throw new ArithmeticException("not eligible");
        }
        else{
            System.out.println("eligible");
        }

}}
