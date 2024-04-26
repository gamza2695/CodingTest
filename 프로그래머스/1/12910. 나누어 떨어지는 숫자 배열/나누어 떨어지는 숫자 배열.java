import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor==0) answer.add(arr[i]);
		}
		
		Collections.sort(answer);
        
		if(answer.isEmpty()) answer.add(-1);
        
        return answer;
    }
}