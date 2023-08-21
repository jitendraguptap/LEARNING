package multiple_of_10_checker;
import java.util.*;
public class Multiple_of_10_checker {
	public static void checkmultipleoften(int n) {
		if(n%10==0) {
			System.out.println("The number is a multiple of 10");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		checkmultipleoften(n);
		
	}

}
