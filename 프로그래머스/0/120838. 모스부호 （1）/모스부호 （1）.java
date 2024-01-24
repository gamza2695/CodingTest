class Solution {
    public String solution(String letter) {
        String answer = "";
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                          ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                          ".--","-..-","-.--","--.."};        
		String[] l = letter.split(" ");
		
		for(int i=0; i<l.length; i++) {
			for(int j=0; j<morse.length; j++) {
				if(l[i].equals(morse[j])) answer+= (char)(j+97);
			}
		}        
        
        return answer;
    }
}