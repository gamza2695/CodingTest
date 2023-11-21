class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
		int num2 = Integer.valueOf(String.valueOf(b) + String.valueOf(a));
		answer = num1 >= num2 ? num1:num2;
        return answer;
    }
}