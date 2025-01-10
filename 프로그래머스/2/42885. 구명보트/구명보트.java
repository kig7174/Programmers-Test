import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0;
        int i = 0;
        int j = people.length - 1;

        while (i < j) {
            int sum = people[i] + people[j];
            if (sum > limit) {
                j--;
            } else if (sum <= limit) {
                i++;
                j--;
                count++;
            }
        }

        return people.length - count;
    }
}