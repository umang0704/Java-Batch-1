package scanners;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int a = sc.nextInt();
        System.out.println(a);
        
        sc.nextLine();
        
        System.out.println("Enter any String");
        String b = sc.nextLine();
        System.out.println(b);
        
    }
}
