package decisions;
 
import java.util.Scanner;

public class Switch1 {
    
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int a = sc.nextInt(); 
        switch(a){ 
            case 18:
                System.out.println("You recently enetred adulthood"); 
            default:
                System.out.println("You can either be adult or minor"); 
                break;
        }
    }
}
