package inheritance;

class A {

    public int a;
    public int b;

    public void add(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }

    A() {
        System.out.println("const - A");
    }

}
//single 

class B extends A {

    public void add1(int x, int y) {
        add(x, y);
    }

    B() {
        System.out.println("const - B");
    }
}

public class In_2 {

    public static void main(String[] args) { 
        A obj2 = new B();
        //obj2.add1(5,6);
    }
}
