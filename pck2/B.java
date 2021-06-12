package pck2;
 
import pck1.*;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        //public
        System.out.println(obj.b);
        System.out.println(obj.sb);
        System.out.println(A.sb);
        
        //private
       // System.out.println(obj.a);
//        System.out.println(obj.sa);
//        System.out.println(A.sa);
        //protected
        //System.out.println(obj.c);
        
//      default
        //System.out.println(obj.d);
    }
}
