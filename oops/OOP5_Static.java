package oops;

class A {

    static void m1() {
        System.out.println(a);
    }

// if a static variable is required to be accessed in a static block then the 
//static variable must be declared before the static block.
    static {
        a = 101;
        //System.out.println(a); 
    }
    static int a = 10;
}

public class OOP5_Static {

    public static void main(String[] args) {
        A.m1();
        System.out.println(A.a);
    }
}
