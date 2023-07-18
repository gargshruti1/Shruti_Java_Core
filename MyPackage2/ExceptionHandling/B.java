package MyPackage2.ExceptionHandling;

public class B {
    public static void main(String args[]){
        B b = new B();
        try{
             b.Divide();
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("hello");
    }
    void Divide(){

        int a = 100, b = 0 , c;
        c = a/b;
        System.out.println(c);
    }
}
