import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<progresses.length; i++) {
            queue.add((int)Math.ceil((100.0-progresses[i])/speeds[i])); 
        }

        while (!queue.isEmpty()) {  
            int day = queue.poll(); 
            int count = 1;

            
            while (!queue.isEmpty() && queue.peek() <= day) {
                queue.poll();
                count++;
            }               
        
            list.add(count);
        }

        return list;
    }
}