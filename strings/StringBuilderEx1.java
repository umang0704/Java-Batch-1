 
package strings;

//StringBuilder allows the changes in the object iself
//String builder has un-synchronized methods that means 
//single thread or code can  access the object more than one at time
public class StringBuilderEx1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Umang Yadav");
        StringBuilder s1 = new StringBuilder(20);
        
        s.append("Java");
        s.append(10);
        s.insert(0, "Java");
        //s.reverse();
        s.delete(4,9);
        s.replace(0,4,"Umang");
        s.deleteCharAt(5);
        
        System.out.println(s);
        
        String s2 = s.toString();
        System.out.println(s2.length());
    }
  
}
