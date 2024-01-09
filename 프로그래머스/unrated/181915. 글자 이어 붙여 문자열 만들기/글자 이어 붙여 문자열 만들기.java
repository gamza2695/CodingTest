class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] result = new char[index_list.length];
		
		for(int i = 0; i<result.length;i++) {
			result[i] = my_string.charAt(index_list[i]);
		}
		
		answer = String.valueOf(result);
        
        return answer;
    }
}