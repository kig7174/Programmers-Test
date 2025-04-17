class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i=0; i<array.length; i++) {
            String a = String.valueOf(array[i]);
            String[] b = a.split("");
            
            for (int j=0; j<b.length; j++) {
                if (b[j].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}