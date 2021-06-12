package inheritance;

class A {
    static{
        System.out.println("static - A");
    }
    {
        System.out.println("init - A");
    }
    A(){
        System.out.println("const - A");
    }  

}

class B extends A {
     static{
        System.out.println("static - B");
    }
    {
        System.out.println("init - B");
    }
    B(){
        System.out.println("const - B");
    }  
    
}

public class Inheritance1 {

    public static void main(String[] args) {
         B obj = new B();
    }
}
