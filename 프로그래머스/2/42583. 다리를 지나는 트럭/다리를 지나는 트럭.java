import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> queue = new ArrayDeque<>();

        int total_weight = 0;
        int seconds = 0;

        for (int truck_weight : truck_weights) {
            while (true) {               
                if (queue.isEmpty()) { // 다리가 아예 빈 경우
                    queue.add(truck_weight);
                    total_weight += truck_weight;
                    seconds++;
                    break;

                } else if (queue.size() == bridge_length) { // 다리가 꽉 찬 경우
                    total_weight -= queue.poll();

                } else { // 다리의 자리가 비어 있는 경우 1) 다리가 무게를 견딜 수 없는 경우 2) 다리가 다음 트럭이 지나가도 견딜 수 있는 경우
                    if (weight >= total_weight + truck_weight) {
                        queue.add(truck_weight);
                        total_weight += truck_weight;
                        seconds++;
                        break;
                        
                    } else {
                        queue.add(0);
                        seconds++;
                    }
                }
            }
        }

        return seconds + bridge_length;
    }
}