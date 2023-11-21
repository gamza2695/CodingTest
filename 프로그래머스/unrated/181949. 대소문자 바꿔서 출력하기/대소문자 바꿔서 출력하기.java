import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] input = a.toCharArray();
        
        for(int i = 0; i<a.length();i++) {
        	
        	if(input[i]>=97) {
        		input[i] = (char) (input[i] - 32);
        	}
        	else {
        		input[i] = (char) (input[i] + 32);
        	
        	}
        }
        System.out.println(input);
    }
}