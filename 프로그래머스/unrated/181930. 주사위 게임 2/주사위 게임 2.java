class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int case1 = a + b + c;
        int case2 = case1 * (a * a + b * b + c * c);
        int case3 = case2 * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        
        if(a != b && a != c && c != a) {
            answer = case1;
        }
        if(a == b || a == c || b == c) {
            answer = case2;
        }
        
        if(a == b && a == c) {
            answer = case3;
        }
        
        return answer;
    }
}