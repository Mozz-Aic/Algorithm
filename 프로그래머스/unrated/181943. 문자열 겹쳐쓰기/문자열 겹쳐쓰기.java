class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String sub1 = my_string.substring(0, s);
        String sub2 = my_string.substring((s + overwrite_string.length()), my_string.length());
        
        answer = sub1 + overwrite_string + sub2;        
        
        return answer;
    }
}