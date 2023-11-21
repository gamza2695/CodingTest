class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] my = my_string.toCharArray();
        char[] over = overwrite_string.toCharArray();
        int k = 0;
       
        for(int i = s; i<overwrite_string.length()+s;i++) {
            my[i] = over[k];
            k++;
        }
        answer = String.valueOf(my);
        return answer;
    }
}