package inheritance;

class A {

    public int a;
    public int b;

    public void add(int a ,int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }
}
//single 
class B extends A{
    void display(){
        System.out.println(a);
        System.out.println(b);
        add(5,6);
    }
//    public void add1(int x,int y){
//        add(x,y);
//    }
}

public class In_1 {

    public static void main(String[] args) {
        
        
//        B obj = new B();
//        obj.add(5,6);
//        System.out.println(obj.a);
//        System.out.println(obj.b);
//        obj.add1(5,6);
    }
}
