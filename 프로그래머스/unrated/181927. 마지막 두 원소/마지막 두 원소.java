class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int length = num_list.length;
        int appendNum = 0;
        if(num_list[length - 1] > num_list[length - 2]) {
            appendNum = num_list[length - 1] - num_list[length - 2];
        } else {
            appendNum = num_list[length - 1] * 2;
        }
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length-1] = appendNum;
        
        return answer;
    }
}