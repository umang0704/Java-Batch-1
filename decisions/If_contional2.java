package decisions;

public class If_contional2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        boolean c = true;
//        if (a > b) {
//            System.out.println("if");
//        } else if (a == b) {
//            System.out.println("else if");
//        } else {
//            System.out.println("else");
//        }
        
        if(a<b){
            System.out.println("<");
        }else{
            if(a==b){
                System.out.println("==");
            }else{
                System.out.println(">");
            }
        }
        
        if(a<b) 
            System.out.println("<");
        else if(a==b)
                System.out.println("==");
        else
            System.out.println(">");
            
         
        if(true)
            System.out.println("");
        else
            System.out.println("");
            
 
    }
}
