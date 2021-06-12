package basics;

public class OperatorEx2 {

    public static void main(String[] args) {
        int a = 55, b = 79;
        int c = 0;
        boolean d;
        // c = --a+a+a++;
        //c=--a+a--*a++-++a; 
        //c = ++a%a--/a++-++a*a--;
        //b += (++a / 4 + b) - 5;
        //d = ++a < b-- && a++ != --b;
        //c = ++a < b-- ? a++ * b++ + a : b++ / --a + a++;
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
        // System.out.println(d);

    }
}
/*
Precedence order
! 
++ --
* + %
+ -
&& ||



 */
