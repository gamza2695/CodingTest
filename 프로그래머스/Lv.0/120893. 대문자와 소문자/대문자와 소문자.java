class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)<97){
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }
            else{
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            }
        }        
        
        return answer;
    }
}