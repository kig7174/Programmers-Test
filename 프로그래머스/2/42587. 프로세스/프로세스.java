import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int a = 0;

        for (int i=0; i<priorities.length; i++) {
            queue.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            for (int i=0; i<priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    a++;

                    if (location == i) {
                        return a;
                    }
                }
            }
        }

        return a;
    }
}