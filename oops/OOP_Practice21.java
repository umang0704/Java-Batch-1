 
package oops;
class A{
    
    static void i(){
        System.out.println(a);
    }
    static{
        i();
    }
    {
        System.out.println(++a);
    }
    A(){
        System.out.println(++a);
    }
    private static int a  = 0;
}
 
public class OOP_Practice21 {
    public static void main(String[] args) {
        A a =new A();
    }
}
