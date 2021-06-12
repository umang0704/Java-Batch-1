package oops;

class Constructor1 {

    int a = 10;
    int b = 20;

    void m1() {
        System.out.println(a + b);
    }

    Constructor1(){
        System.out.println("Hello From Constructor");
    }
//    Constructor1(){
//        
//    }
    Constructor1(String name){
        System.out.println("Hello "+name);
    }
    Constructor1(int name){
        System.out.println("Hello "+name);
    }
}

public class OOP6_Constructor1 {

    public static void main(String[] args) {
        Constructor1 o = new Constructor1();
        Constructor1 o1 =new Constructor1("Rahul");
    }
}
