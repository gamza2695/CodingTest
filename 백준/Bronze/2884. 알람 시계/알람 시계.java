import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute<45) {
			hour-=1;
			minute= minute+60-45;
		}
		else {
			minute -=45;
		}
		
		if(hour<0) {
			hour +=24;
		}
		System.out.println(hour + " " +  minute);
	}
}