package factorial_Calculator;
import java.util.*;
public class Factorial_Calculator {
	public static void calculateFactorial(int n)

	{
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		calculateFactorial(num);
	}

}
