 
package oops;
class A{
    
    static int print(){ 
        return a;
    }
    static{
        System.out.println(print());  
    }
    
    {
        System.out.println(++a);   
    }
    A(){
        System.out.println(++a);
    }
    static int a = 0;
}
 
public class OOP_Practice2 {
    public static void main(String[] args) {
        A a =new A();
    }
}
