package oops;

class XYZ {

    int a = 10;

    {
        System.out.println("Hi from initialize block.");
    }

    XYZ() {
        System.out.println("Hi from non-param constructor");
    }
}

public class OOP7_InitializeBlock1 {

    public static void main(String[] args) {
        XYZ obj = new XYZ();
    }
}
