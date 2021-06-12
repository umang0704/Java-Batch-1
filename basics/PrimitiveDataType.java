package basics;

public class PrimitiveDataType {

    public static void main(String[] args) {
        //byte
        byte ba = 10;
        System.out.println("byte ba: " + ba);
        byte ba1 = -128;
        System.out.println("byte ba1: " + ba1);
        byte ba2 = 127;
        System.out.println("byte ba1: " + ba2);
        System.out.println("-------------------------");
        //ba2 = ba + ba; //error - lossy conversion int to byte
        // ba2 = 128; //error - lossy conversion int to byte

        //short
        short s1 = 10;
        System.out.println("short s1: " + s1);
        short s2 = -32768;
        System.out.println("short s2: " + s2);
        short s3 = 32767;
        System.out.println("short s3: " + s3);
        System.out.println("-------------------------");
        // s3 = s1+s1;//error - lossy conversion int to byte

        //int default value can be learnt as 2^31
        int i1 = 234;
        System.out.println("int i1: " + i1);
        int i2 = (int) (Math.pow(2, 31));
        System.out.println("i2: " + i2);
        int i3 = (int) (-Math.pow(2, 31) - 1);
        System.out.println("i3: " + i3);
        System.out.println("-------------------------");

        //long
        long l = 10;
        System.out.println("l:" + l);
        System.out.println("-------------------------");

        //float
        //float f1 = 10.0;//error-lossy conversion double to float
        float f1 = 10.0f;//10.0F
        System.out.println("f1: " + f1);

        //double
        double d1 = 10.0;
        double d2 = 10.0d;
        double d3 = 10.0D;
        System.out.println("d1: " + d1 + " " + "d2: " + d2 + " " + "d3: " + d3);

        //boolean
        boolean b1 = true;// TRUE;
        boolean b2 = false;
        
        System.out.println(b1+" "+b2);
        
        //char
        char c1 = 'a';
        System.out.println("c1: "+c1);

    }
}
