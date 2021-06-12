package oops; 
public class OOP4_Method2 {
    int m1(){ 
       return 10;
    }
    
    double m2(int a , int b){
        return (a+b);
    }
    
    char m3(int c){
        return (char)c;
    }
    
    int m4(char d){
        return d;
    }
    
    double m5(long e){
        return e;
    }
    
    public static void main(String[] args) {
        OOP4_Method2 obj = new OOP4_Method2();
        int a = obj.m1();
        System.out.println(a);
        
        double b = obj.m2(7,8);
        System.out.println(b);
        
        System.out.println(obj.m2(5,5));
        System.out.println(obj.m3(100));
        System.out.println(obj.m4(obj.m3(100)));
        System.out.println(obj.m5(Long.MAX_VALUE));
        System.out.println(Long.MAX_VALUE);
    }
}
