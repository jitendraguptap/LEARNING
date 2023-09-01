package sum_of_Digits_Calculator;
import java.util.*;
public class Sum_of_Digits_Calculator {
	

	public static void calculateSumOfDigits(int n)

	{
		int sum=0;
		while(n!=0) {
			int res=n%10;
			sum=sum+res;
			n=n/10;
			
		}
		System.out.println(sum);
	

	}

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateSumOfDigits(n);
	}

}
