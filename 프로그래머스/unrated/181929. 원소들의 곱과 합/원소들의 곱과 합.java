class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        int sumMul = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }
        sumMul = sum * sum;
        
        if(mul < sumMul) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}