package polymorphism;

class A {

    static public int a = 10;
    public int b = 20;
    static public int c = 11;
    public int d = 9;

    void m1() {
        System.out.println("m1-a");
    }

    static void m2() {
        System.out.println("m2-a");
    }
}

class B extends A {

    static public int a = 1;
    public int b = 2;
    public int c = 1;
    static public int d = 90;

    void m1() {
        System.out.println("m1-b");
    }

    static void m2() {
        System.out.println("m2-b");
    }
}

public class Poly_runtimePoly1 {

    public static void main(String[] args) {
//        A obj = new A();
//        obj.m1();
//        obj.m2();
//        System.out.println(obj.a + " " + obj.b+" " + obj.c+" " + obj.d);

//        B obj1 = new B();
//        obj1.m1();
//        obj1.m2();
//        System.out.println(obj1.a + " " + obj1.b+" " + obj1.c+" " + obj1.d);
        
//        A obj2 = new B();
//        obj2.m1();
//        obj2.m2();
//        System.out.println(obj2.a + " " + obj2.b + " " + obj2.c + " " + obj2.d);
    }
}
