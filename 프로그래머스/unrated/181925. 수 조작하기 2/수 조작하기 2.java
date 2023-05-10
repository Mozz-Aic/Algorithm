class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++) {
            switch(numLog[i] - numLog[i - 1]) {
                case 1:
                    answer += 'w';
                    continue;
                case -1:
                    answer += 's';
                    continue;
                case 10:
                    answer += 'd';
                    continue;
                case -10:
                    answer += 'a';
                    continue;
            }
        }
        return answer;
    }
}