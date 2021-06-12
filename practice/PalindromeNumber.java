package practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int a){
        int x = a;
        int p = 0;
        while (x != 0) {
            int temp = x % 10;
            p = p * 10 + temp;
            x = x / 10;
        }
        return a == p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range");
        int start = sc.nextInt();  
                
        System.out.println("Enter the ending range");
        int end = sc.nextInt();
        for(int i = start+1;i<end;i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }
        

    }
}
