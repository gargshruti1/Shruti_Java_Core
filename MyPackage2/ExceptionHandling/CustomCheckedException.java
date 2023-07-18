package MyPackage2.ExceptionHandling;

public class CustomCheckedException extends Exception{
    CustomCheckedException(){
        super ("underage");}
CustomCheckedException(String msg){
super(msg);
}
}
class Voting {
public static void main(String[]args) throws CustomCheckedException {
int age = 15;
if (age <18){
throw new CustomCheckedException();}
else {
        System.out.println("can vote");}
    {
        throw new CustomCheckedException();
        }}}