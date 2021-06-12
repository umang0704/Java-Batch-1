package inheritance; 
class A {

    static int a;

    static {
        System.out.println("static - a");
    }

    {
        System.out.println("init - a");
    }

    void sqA(int a) {
        this.a = a;
        System.out.println(this.a * this.a);
    }

    A() { 
        System.out.println("const - A");
    }

}
//single 

class B extends A {

    static int b;

    static {
        System.out.println("static - b");
    }

    {
        System.out.println("init - b");
    }

    void sqB(int b) {
        this.b = b;
        System.out.println(this.b * this.b);
    }

    B() {
        System.out.println("const - B");
    }
}

public class In_3 {

    public static void main(String[] args) {
        A obj = new B();
//     B obj1 = new A();
    }
}
