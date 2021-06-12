 
package basics;
 
public class OperatorEx1 {
    public static void main(String[] args) {
        //assignment 
        int a = 10;
        System.out.println("a = 10->"+a);
        
        //arithemematic
        int b =13;
        int c = a+b;
        System.out.println("addition "+c);
        c = a-b;
        System.out.println("minus "+c);
        c=a*b;
        System.out.println("mult "+c);
        c=a/b;
        System.out.println("div "+c); 
        c = b%a;
        System.out.println("modulus "+c);//remainder
        
        //c = a/0;//java.lang.ArithmeticException: / by zero
        //System.out.println("indeterminant "+c);
        
        //short-hand or compound operators
        int x = 1;
        x = x+1;
        System.out.println(x);
        x += 1; //x = x+1;
        System.out.println(x);
        
        x-=1;// x=x-1
        System.out.println(x);
        x*=2;// x=x*2
        System.out.println(x);
        x/=2;//x=x/2
        System.out.println(x);
        
        //internal typecasting by shorthand operators
        byte b1 = 2;
        System.out.println("b1 "+b1);
        b1 += 2;
        System.out.println("b1 "+b1);
        b1+=127;
        System.out.println("b1 "+b1);
        //b1 = b1 +2;//error-lossy conversion
        
        //increement and decreement
        int q = 10;
        //post-fix -  assignment and the incree/decree 
        q++;//q = q+1
        
        //pre-fix - incree/decree and then assignment
        ++q;//q = q+1
        int s = 10;
        int t =10;
        int e = s++;
        int u = ++t;
        System.out.println("s:"+s);
        System.out.println("t:"+t);
        System.out.println("e:"+e);
        System.out.println("u:"+u);
        
        //internal downcasting
        byte az = 10;
        //az =az+1;//lossy conversion
        az++;
        az--;
        
        
        //relational operators - return true or false
        int qq =10;
        int ww = 11;
        int ee = 11;
        //== This checks wether the two values are equal or not
        System.out.println(qq==qq);
        System.out.println(qq==ww);
        System.out.println(qq==ee); 
        System.out.println(ww==qq);
        System.out.println(ww==ww);
        System.out.println(ww==ee); 
        //<= >=  < >
        System.out.println(2<3);
        System.out.println(2<=3);
        System.out.println(3<3);
        System.out.println(3<=3);
        System.out.println(2>3);
        System.out.println(2>=3);
        System.out.println(3>3);
        System.out.println(3>=3);
        
        //!=
        System.out.println(2!=3);
        System.out.println(2!=2);
        
        //logical operators - && || !
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(!true);
        System.out.println(!(true&&false));
        
        //conditionals - exp1 ? exp2 : exp3
        //exp1 - true(exp2) or false(exp3)
        int ab = 10;
        int bc = 20;
        int cd = bc > ab ? ab++ : bc++;
        System.out.println(cd);
        
        //bitwise operator- false=0 and true=1
        ab = 4;
        bc = 6;
        cd = ab & bc;
        /*
        4 - 100
        6 - 110
        cd- 100
        */
        System.out.println(cd);
        cd = ab | bc;
        System.out.println(cd);
        cd = ab ^ bc;//same = false or 0 and diff=1 or true
        /*
        ab = 100
        bc = 110
        cd = 010
        */
        System.out.println(cd);
        cd = ab>>1;
        /*
        16 8 4 2 1
             1 0 0
               1 0 | 0
        */
        System.out.println(cd);
        System.out.println(ab);
        cd = ab<<2;
        System.out.println(cd);
        
        cd = ~ab;//-(a+1)
        System.out.println(cd);
        
    }
}
