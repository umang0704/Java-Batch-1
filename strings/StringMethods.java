package strings;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Umang Yadav";
        String s1 = "Java";
//        String s3 = s.concat(s1);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.charAt(6));
        System.out.println(s.concat(s1));
        System.out.println(s+s1);
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 9));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a',4));
        System.out.println(s.indexOf('k'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.lastIndexOf('a',8));
        System.out.println("  Hi  Hello  ".trim());
        System.out.println(s.equals(s1));
        System.out.println(s.equals("Umang Yadav"));
        System.out.println(s.equals("umang Yadav"));
        System.out.println(s.equalsIgnoreCase("umang Yadav"));
        System.out.println("--------------------\n"+s+" \n"+s1+"\n--------------------\n");
        
    }
}
