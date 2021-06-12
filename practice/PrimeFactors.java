package practice;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0 || x==1){
            System.out.println("Input dose not have prime factors.");
            return;
        }
            
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
                x = x / i;
                i--;
            }
        }

    }
}
