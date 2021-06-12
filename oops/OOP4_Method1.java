package oops; 
public class OOP4_Method1 {
    // return type - void 
    void m1(){
        System.out.println("Hi");
        return;
    }
    
    //void type, parameters
    void m2(int a , int b){
        System.out.println(a+b);
        return;
        //System.out.println("hello"); error - unreachable code.
    }
    
    public static void main(String[] args) {
        OOP4_Method1 obj = new OOP4_Method1();
        obj.m1();
        obj.m2(5,6);
        double d =  3.0;
        double e = 8.0 ;
        //obj.m2(d, e); lossy conversion
        //System.out.println(obj.m1()); - void is not allowed in println parameters.
    }
}
