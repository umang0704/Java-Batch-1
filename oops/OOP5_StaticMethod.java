package oops;

class Society {

    int a = 10;
    static int b = 20;

    //memory allocation is done at class loading
    //can be called using class name
    
    //non-static context cannot be accessed in static context.
    //static context can be accessed from non-static context.
    
    //non-static members are allocated with memory when the constructor is call after new keyword.
    static int m1() {
        System.out.println("Hi from m1()");
        return 0;
    }

    static int m2() {
        //return a; - error
        return b;
    }
    
    int m3(){
       return b;
    }
    
    static{
        System.out.println(b);        
        //System.out.println(a);
       // System.out.println(m3());

    }
}

public class OOP5_StaticMethod {

    public static void main(String[] args) {
        System.out.println(Society.m1());
        Society o =new Society();
    }

}
