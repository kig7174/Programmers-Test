import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> a = new ArrayList<>();
        for (int i=0; i<todo_list.length; i++) {
            if (finished[i] == false) {
                a.add(todo_list[i]);
            }
        }
        return a.toArray(String[]::new);
    }
}