package oops;

class XYZ {

    {
        System.out.println("Hi from initialize block2.");
    }

    {
        System.out.println("Hi from initialize block.");
        //System.out.println(a); error
        a = 20;
    }
    int a = 10;

    XYZ() {
        System.out.println("Hi from non-para-constructor");
        System.out.println(a);
    }
}

public class OOP7_InitializeBlock4 {

    public static void main(String[] args) {
        XYZ obj = new XYZ();
    }
}
