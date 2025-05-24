import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] a = myString.split("x");
        ArrayList<String> b = new ArrayList<>();
        
        for (String a1 : a) {
            if (!a1.equals("")) {
                b.add(a1);
            }
        }

        Collections.sort(b);
        
        return b.stream().toArray(String[]::new);
    }
}