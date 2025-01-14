import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."
        };
        
        String[] a = {
            "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
            "p","q","r","s","t","u","v","w","x","y","z"
        };
        
        String[] letters = letter.split(" ");
        
        for (int i=0; i<letters.length; i++) {
            for (int j=0; j<morse.length; j++) {
                if (letters[i].equals(morse[j])) {
                    answer += a[j];
                }
            }
        }
        
        return answer;
    }
}