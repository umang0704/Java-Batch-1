package abstractclasses;

abstract class AC {

    //abstract methods
    abstract void m1();

    //non-abstract method
    void m2() {
        System.out.println("Hi-AC");
    }

    static {
        System.out.println("static-AC");
    }

    {
        System.out.println("init-AC");
    }

    AC() {
        System.out.println("constructor-AC");
    }
}

class C extends AC {

    @Override
    void m1() {
        System.out.println("Hi-C");
    }
}

class D extends AC {

    @Override
    void m1() {
        System.out.println("Hi-D");
    }
}

public class AC1 {

    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        // AC obj1 =new AC();
        System.out.println("-------------------");
        AC obj2 = new C();
        obj2.m1();
        System.out.println("-------------------");
        obj2 = new D();
        obj2.m1();

    }
}
