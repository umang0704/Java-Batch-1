package practice;

import java.util.StringTokenizer;
import utilities.GetValue;

 
public class StrinSplitUp {
    public static void main(String[] args) {
        String str =GetValue.scanString("Enter String:");
        String del = GetValue.scanString("Enter Delimeter");
        if(str.length()<del.length() || del.length()>1){
            System.out.println("Invalid Input.");
            return;
        }
        int delCount = 0;
        for(int i = 0 ; i < str.length() ; i ++ ){
            if(str.charAt(i) == del.charAt(0)){
                delCount++;
            }
        }
        String[] arr = new String[delCount+1];
        int arrayIndexRef = 0;
        int prev = 0;
        for(int i = 0; i< str.length() ; i++){
            if(str.charAt(i) == del.charAt(0)){
                arr[arrayIndexRef++] = str.substring(prev,i);
                prev = i+1;
            }
        }
        arr[arrayIndexRef] = str.substring(prev);
        for(String s1 : arr)
            System.out.println(s1); 
        
        System.out.println("---------");
        
        
        StringTokenizer s0 = new StringTokenizer(str,del);
        while(s0.hasMoreTokens())
            System.out.println(s0.nextToken());
    }
}
