package final_keyword;

class A {

    final int b;
    final int a = 10;

    {
        //a = 12;

    }

    A() {
        //a = 11;
        b = 12;
    }

    void m1() {
        //a = 11;
        // a++;
        //b =11;
    }
}

class B {

    //final static int a;

    static {
        //a=1;
    }

    {
        //a=1;
    }

    B() {
        //a = 1;
    }

    void m2() {

    }
}

public class FinalVariable {

    public static void main(String[] args) {

    }
}
