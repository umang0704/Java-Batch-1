 
package strings;

//StringBuffer allows the changes in the object iself
//String buffer has synchronized methods that means 
//single thread or code can only access the object one at time
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Umang Yadav");
        StringBuffer s1 = new StringBuffer(20);
        
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
