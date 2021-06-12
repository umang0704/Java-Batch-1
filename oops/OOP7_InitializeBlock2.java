package oops;

class XYZ {

    int a = 10;

    {
        System.out.println("Hi from initialize block.");
    }

    XYZ() {
        this(4);
        System.out.println("Hi from non-param constructor");
    }

    XYZ(int c) {
        System.out.println("Hi from para-constructor");
    }
}

public class OOP7_InitializeBlock2 {

    public static void main(String[] args) {
        XYZ obj = new XYZ();
    }
}
