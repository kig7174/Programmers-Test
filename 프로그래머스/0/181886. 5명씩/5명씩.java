import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> a = new ArrayList<>();
        int count = 4;
        for (int i=0; i<names.length; i++) {
            count++;
            if (count == 5) {
                a.add(names[i]);
                count = 0;
            }    
        }
        return a.toArray(String[]:: new);
    }
}