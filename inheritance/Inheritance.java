package inheritance;

class A {

    int a = 10;

    void m1() {
        System.out.println("m1-A");
    }

}

class B extends A {

    int b = 20;

    void m2() {
        System.out.println("m2-B");
    }
    
    void displayA(){
        System.out.println(super.a);
        super.m1();
    }
}

public class Inheritance {

    public static void main(String[] args) {
        B obj = new B();
        obj.m1();
        System.out.println(obj.a);
        obj.displayA();
    }
}
