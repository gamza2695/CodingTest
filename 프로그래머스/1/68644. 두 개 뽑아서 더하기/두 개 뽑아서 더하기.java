import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<numbers.length; i++) {		
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);			
			}	
		}
		
		int[] answer = new int[set.size()];
		int k = 0;
		for(int i: set) {
			answer[k++] = i;
		}
        Arrays.sort(answer);
        return answer;
    }
}