package MyPackage2.MultilevelInheritance;

public class A { //multilevel inheritance
    public void showA() {

        System.out.println("a class method ");
    }

    public static void main(String[] args) {
        N a = new N();
        a.showA();
        System.out.println("----------------");
        B b = new B();
        b.showA();
        b.showB();
        System.out.println("----------------");
        C c = new C();
        c.showA();
        C.showC();
        System.out.println("----------------");
    }
}
    class B extends N {
        void showB (){

            System.out.println("b class method");
        }
    }
    class C extends N {
    static void showC(){
        System.out.println("C class method");
    }
    }



