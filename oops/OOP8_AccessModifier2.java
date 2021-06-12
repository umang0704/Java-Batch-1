package oops;

class MyClass {

    //public int a = 10;
    private int a = 10;

    public void m1() {
        System.out.println(a);
    }
}

public class OOP8_AccessModifier2 {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.m1();

    }
}
