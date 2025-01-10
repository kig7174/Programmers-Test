class Solution {
    public int[] solution(int[] sequence, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int size = sequence.length;   

        int[] answer = new int[2];

        while (i < sequence.length) {
            if (sum < k && j < sequence.length) {
                sum += sequence[j];
                j++;
            } else if (sum > k) {
                sum -= sequence[i];
                i++;
            } else {  
                if (sum == k) {                        
                    if (size > j - 1 - i) {
                        size = j - 1 - i;
                        answer[0] = i;
                        answer[1] = j - 1;
                    }
                }

                sum -= sequence[i];
                i++;
            }
        }

        return answer;
    }
}