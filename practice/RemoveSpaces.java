package practice;

import utilities.GetValue;

public class RemoveSpaces { 
    private static String deleteCharacter(String str, int i) {
        if (i == 0) {
            return str.substring(1);
        }
        return str.substring(0, i) + str.substring(i + 1);
    }

    public static void main(String[] args) {
        String str = GetValue.scanString("Enter string to remove space:");
  
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str = deleteCharacter(str, i--);
            }
        }
        System.out.println(str);
    }

}
