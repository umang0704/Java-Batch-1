package practice;

import utilities.GetValue;

 
public class StringContains {
    public static void main(String[] args) {
        String str = GetValue.scanString("Enter String 1:");
        String pat = GetValue.scanString("Enter String 2:");
        if(str.indexOf(pat)>=0){
            System.out.println(pat+" is contained in the sentence.");
            return;
        }
        System.out.println(pat+" is not contained in the sentence.");
    }
}
