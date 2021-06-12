package strings;

public class String1 {

    public static void main(String[] args) {
        String obj = new String("Hi");
        String obj2 = "Hi";
        String obj3 = new String("Hi");
        String obj4 = "Hi";

        //String obj5 = new String("tuesday");
        char[] obj5 = {'t','u','e','s','d','a','y'};
        String obj6 = new String(obj5,3,3);//sda
        System.out.println(obj6);
        
        System.out.println(obj == obj3);
        System.out.println(obj.equals(obj3));

        System.out.println(obj2 == obj4);
        System.out.println(obj2.equals(obj4));

        System.out.println(obj);
        System.out.println(obj2);
    }
}
