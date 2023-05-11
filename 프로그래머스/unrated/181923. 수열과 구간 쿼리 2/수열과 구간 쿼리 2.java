import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int[] filteredArr = new int[e - s + 1];
            int idx = 0;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    filteredArr[idx++] = arr[j];
                }
            }
            
            if (idx > 0) {
                Arrays.sort(filteredArr, 0, idx);
                answer[i] = filteredArr[0];
            } else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}