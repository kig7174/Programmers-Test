import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> a = new ArrayList<>();
        for (int i=0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                a.add(strArr[i]);
            }
        }
        return a.toArray(String[]::new);
    }
}