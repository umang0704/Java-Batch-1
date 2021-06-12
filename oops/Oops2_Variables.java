package oops;
 //class variables - variables hold data 
//variables can be of primitive data types, user defined data types(Classes(same class variable),Interfaces Enum ryc)
//anything in the clas is accessible anywhere in the class.

 

class PrimitiveVariables{
    //only declaration of primitive data types.
    //if only declaration is needed, it  is allowed at class level.
    byte a;
    short b;
    char c;
    int d;
    long e;
    float i;
    double f;
    boolean g;
   
    void printAll(){ 
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        System.out.println("e:"+e);
        System.out.println("f:"+f);
        System.out.println("g:"+g);
        System.out.println("h:"+i);
    }
}

public class Oops2_Variables {
    public static void main(String[] args) {
        PrimitiveVariables obj = new PrimitiveVariables();
        obj.printAll();
    }
}
