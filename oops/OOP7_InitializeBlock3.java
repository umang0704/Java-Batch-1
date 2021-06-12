package oops;

class XYZ {

    int a = 10;
    static int b = 10;

    {
        System.out.println("Hi from initialize block.");
        System.out.println(b);
        b = 20;
        System.out.println(a);
        a = 20;
    }

    XYZ() {
        this(4);
        System.out.println("Hi from non-param constructor");
    }

    XYZ(int c) {
        System.out.println("Hi from para-constructor");
    }
}

public class OOP7_InitializeBlock3 {

    public static void main(String[] args) {
        XYZ obj = new XYZ();
    }
}
