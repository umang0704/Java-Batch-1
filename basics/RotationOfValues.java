package basics;

public class RotationOfValues {

    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte)(a+1);
        System.out.println(b);
        a =-128;
        b = (byte)(a-1);
        System.out.println(b);
        int x =Integer.MAX_VALUE;
        System.out.println(x+1);
    }
}
