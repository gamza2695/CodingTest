import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i]==k) answer++;
        }
        
        System.out.println(answer);
	}
}