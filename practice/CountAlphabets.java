package practice;

import utilities.*;
 
public class CountAlphabets {
    public static void main(String[] args) {
        String s =GetValue.scanString("Enter String:");
        if(s.length() == 0){
            System.out.println(0);
            return;
        }
        
        //a-z : 97 - 122
        //A-Z : 65 - 90
        int count = 0;
        
        for(int i = 0; i<s.length();i++){
            
            int temp = (int) s.charAt(i);
            if((temp >= 65 && temp <= 90 )|| (temp >= 97 && temp <= 122)){
                count++;
            }
        }
        System.out.println(count);
    }
}
