package basics;

public class Typecasting1 {

    public static void main(String[] args) {
        //upcasting ir widening
        byte b = 20;
        int a = b;
        //b = a;
        //short c = a;
        long l = a;
        //a = l;

        double d = 10.0;
        //float f = d;

        d = l;
        d = b;
        d = a;
        
        //downcasting
        b =(byte) a;
        short c =(short) a; 
        a = (int) l;
        float f =(float) d;
        a =(int) d;
        
        //remember
        b = (byte)(b+b);
        byte x = 1;
        byte y = 2;
        //b = x+y;//error
        
        short s = 2;
        byte xx = 1;
       //c = xx+s;//error
    }
}
