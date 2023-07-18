package MyPackage2.ExceptionHandling;
public class CustomizedUnchekedException  extends RuntimeException{
    CustomizedUnchekedException(){
            super ("underage");}
    CustomizedUnchekedException(String msg){
            super(msg);
        }
    }
    class Vot {
        public static void main(String[] args) {
            try{
                int age = 15;
                if (age < 18) {
                    throw new CustomizedUnchekedException("not eligible");
                } else {
                    System.out.println("eligible");
                }}
            catch (CustomizedUnchekedException e){
                e.printStackTrace();
            }

            System.out.println("hu");
            }
        }