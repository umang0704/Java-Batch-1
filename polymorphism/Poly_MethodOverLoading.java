package polymorphism;

class A {

    public static void sq(short a) {
        System.out.println("short " + (a * a));
    }

    static public void sq(byte a) {
        System.out.println("byte " + (a * a));
    }

//    static public void sq(int a) {
//        System.out.println("int " + (a * a));
//    }
//    static public void sq(long a) {
//        System.out.println("long " + (a * a));
//    }
//    static public void sq(float a) {
//        System.out.println("float " + (a * a));
//    }
//    static public void sq(double a) {
//        System.out.println("double " + (a * a));
//    }
//    static public void sq(Integer a){
//        System.out.println("Integer " + (a * a));
//    }
    static public void sq(Float a) {
        System.out.println("Float " + (a * a));
    }
//    static public void sq(Number a) {
//        System.out.println("Number " + (a));
//    }

    static public void sq(Object a) {
        System.out.println("Object " + (a));

    }

//     static public void sq(var a) {
//        System.out.println("Object " + (a));
//    }
}
// same type > closest typecasting > wrapper or Autoboxing > var inference

public class Poly_MethodOverLoading {

    public static void main(String[] args) {
        int a = 10;
        byte b1 = 10;
        short c = 20;
        float f = 11.0f;
        long l = 3;
        double d = 4.0; 
        A.sq(a);
    }
}
