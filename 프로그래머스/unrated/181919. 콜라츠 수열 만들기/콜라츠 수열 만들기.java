import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        for(int i = n; i > 0; i--) {
            if(n == 1) {
                break;
            }
            if(n % 2 == 0) {
                n = n / 2;
                list.add(n);
            } else {
                n = 3 * n + 1;
                list.add(n);
            }    
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}