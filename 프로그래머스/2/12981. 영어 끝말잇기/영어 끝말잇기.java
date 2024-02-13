import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		List<String> list = new ArrayList<>();

		
		for(int i=0; i<words.length; i++) {
			if(( i>0 && !words[i].startsWith(words[i-1].substring(words[i-1].length()-1)))
					|| words[i].length()==1
					|| list.contains(words[i])) {
				answer[0] = i%n + 1;
				answer[1] = i/n + 1;
				
				break;
			}
			
			list.add(words[i]);
			
		}
        
        return answer;
    }
}