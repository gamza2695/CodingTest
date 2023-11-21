class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num = Integer.parseInt(""+a+b);
        answer = num>2*a*b? num:2*a*b; 
        return answer;
    }
}