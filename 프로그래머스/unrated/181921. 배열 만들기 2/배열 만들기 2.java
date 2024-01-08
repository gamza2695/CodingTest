import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
        	int count=0;
        	String numStr = String.valueOf(i);
        	
        	for(int k=0;k<numStr.length();k++) {
        		if(numStr.charAt(k)=='0' || numStr.charAt(k)=='5') {
        			count++;
        		}
        	}
        	if(count==numStr.length()) {
        		result.add(Integer.valueOf(numStr));
        	}
          	
        }
        
        if(result.isEmpty()) {
        	result.add(-1);
        }
        
        answer=result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}