package oops;

class A {

    int a = 10;
    int b;

    void m1() {
        b = 20;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }

}

public class Oop3_ObjectInitialization {

    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
        obj.display();
    }
}
