class Solution {
    public int[] solution(int[] num_list) {
        int k = num_list.length;
        int[] answer = new int[k+1];
        
        for(int i = 0; i<k; i++){
            answer[i] = num_list[i];
        }
        
        answer[k] = num_list[k-2] < num_list[k-1] ? num_list[k-1] - num_list[k-2] : num_list[k-1] * 2;
   
        return answer;
    }
}