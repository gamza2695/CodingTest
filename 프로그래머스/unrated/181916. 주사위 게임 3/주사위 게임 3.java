class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] counts = new int[7];
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;

        for(int i=1;i<=6;i++) {
        	if(counts[i]==4) { 
        		answer=1111*i;
        	}
        	if(counts[i]==3) {
        		for(int j=1;j<=6;j++) {
        			if(j!=i&&counts[j]==1) {
        				answer=(int)Math.pow(10*i+j, 2);
        			}
        		}
        	}
        	if(counts[i]==2) {
        		int k=1;
        		for(int j=1;j<=6;j++) {
        			if(j!=i&&counts[j]==2) {
        				answer=(i+j)*Math.abs(i-j);
        			}
        			else if(j!=i&&counts[j]==1) {
        				k=k*j;
        				answer=k;
        			}
        		}
        	}
        }
        if(counts[a]==1&&counts[b]==1&&counts[c]==1&&counts[d]==1) {
        	for(int l=1;l<=6;l++) {
        		if(counts[l]==1) {
        			answer=l; break;
        		}
        	}
        }
        return answer;
    }
}