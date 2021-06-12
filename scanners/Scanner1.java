package scanners;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any int no.");
        int a = sc.nextInt();
        System.out.println(++a);
        System.out.println("Enter any double no.");
        double b = sc.nextDouble();
        System.out.println("Enter any double no.");
        System.out.println(b);
        System.out.println("Enter any String");
        String c = sc.nextLine();
        System.out.println(c);
        System.out.println("Enter any String");
        String d = sc.next();
        System.out.println(d);
        System.out.println("Enter any character");
        char e = sc.next().charAt(0);
        System.out.println(e);
        sc.close();
        System.out.println("sc closed");
    }
}
