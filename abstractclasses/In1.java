package abstractclasses;

interface In {

    void m1();
    int a = 10;

//    protected void m2();
//    void m2() {
//
//    }
//    In(){
//        
//    }
//    static{
//        
//    }
//    {
//    
//    }
}

interface X extends In {

}

interface Y extends In, X {

}

class B implements In {

    @Override
    public void m1() {
        //In.a = 20;
        System.out.println(In.a);
    }

}

public class In1 {

    B obj = new B();

    In obj1 = new B();
}
