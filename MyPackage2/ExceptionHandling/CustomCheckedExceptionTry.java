package MyPackage2.ExceptionHandling;

public class CustomCheckedExceptionTry  extends Exception{

    CustomCheckedExceptionTry(String msg){
        super(msg);
    }
}
class Vote {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new CustomCheckedExceptionTry("not eligible");
            } else {
                System.out.println("eligible");
            }

        } catch (CustomCheckedExceptionTry e) {
            e.printStackTrace();
        }
    }
}


