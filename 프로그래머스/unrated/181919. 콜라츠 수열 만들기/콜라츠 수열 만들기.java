import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
                List<Integer> result = new ArrayList<>();
     
        result.add(n); 
        
        while(true) {	
            
        	if(n%2==0) {
        		n=n/2;
        		result.add(n);
        	}
        	else if(n%2==1) {
        		n=3*n+1;
        		result.add(n);
        	}        	
        	if(n==1) break;
        	
        }
        
        answer=result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}