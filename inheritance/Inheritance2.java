package inheritance;

class A {

    static {
        System.out.println("static - A");
    }

    {
        System.out.println("init - A");
    }

    A() {
        System.out.println("const - A");
    }

}

class B extends A {

    static {
        System.out.println("static - B");
    }

    {
        System.out.println("init - B");
    }

    B() {
        System.out.println("const - B");
    }

}

public class Inheritance2 {

    public static void main(String[] args) {
        A obj = new A();
        System.out.println("----------------------");
        B obj1 = new B();
        System.out.println("----------------------");
        A obj2 = new B();
        //B obj3 = new A(); //CE
        //B obj3 = (B)new A();//RE
    }
}
