package PrintingStatement;

public class PrintingStatement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Hi heloo jdfhsdb vcujhafasdbfs");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Hi heloo jdfhsdb vcujhafasdbfs "+a);
        System.out.println(a+b);
        System.out.println("Hi heloo jdfhsdb vcujhafasdbfs "+a+b);
        
       //System.out.print("Hi heloo jdfhsdb vcujhafasdbfs");
       
        System.out.printf("%d\n",a);
        System.out.format("%d\n",a);
        System.out.printf("%x\n",a);
        System.out.printf("%X\n",a);
        
        float f = 3.14735936f;
        System.out.printf("%.2f\n",f);
        
        double d = 3.7346289135355786349609376936;
        System.out.printf("%e\n",d);
        System.out.printf("%E\n",d);
        
        String e = "umang";
        System.out.printf("%s\n",e);
        System.out.printf("%S\n",e);
        System.out.printf("%.3S\n",e);
        System.out.printf("'%10S'\n",e);
        System.out.printf("'%-10S'\n",e);
        
        
    }
}
