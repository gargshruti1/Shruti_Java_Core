package MyPackage2.MultipleInheritance;
public interface I1 {
    abstract void show();
}
interface I2{
    void display();
}
class Test implements I1,I2 {
    @Override
    public void show() {
        System.out.println("hi");
    }
    @Override
    public void display() {
        System.out.println("hello");
    }
    public static void main(String args[]) {
        Test test = new Test();
        test.show();
        test.display();
    }
}

