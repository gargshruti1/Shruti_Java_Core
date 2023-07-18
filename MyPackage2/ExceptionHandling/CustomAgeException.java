package MyPackage2.ExceptionHandling;
public class CustomAgeException extends Exception{
     CustomAgeException(String msg){super(msg);}
}
class  Boss{
public static void main(String args[]) throws CustomAgeException {
    int a = 0;
        a = 8 ;
        if (a > 2) {
            throw new CustomAgeException("msg");
        } else {
            System.out.println("no exception");
        }
}
}
