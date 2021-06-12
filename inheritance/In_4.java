package inheritance;

class A {

    static {
        System.out.println("static - a");
    }

    {
        System.out.println("init - a");
    }

    A() {
        System.out.println("Const - A");
    }
}

class B extends A {

    static {
        System.out.println("static - b");
    }

    {
        System.out.println("init - b");
    }

    B() {
        System.out.println("cont - B");
    }
}

public class In_4 {

    public static void main(String[] args) {
        B obj = (B) new A();
//         B obj = new A();
    }
}
