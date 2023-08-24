package fibonacci_Series;
import java.util.*;
public class Fibonacci_Series {
	public static void printFibonacciSeries(int n)

	{
		int num1=0;
		int num2=1;
		if(n==1)
		{
			System.out.print(num1);
		}
		else if(n==2)
		{
		System.out.print(num1+" "+num2);
		}
			else 
			{
		System.out.print(num1+" "+num2+" ");	
		int count=0;
		for (int i=1;count<n-2;i++) 
		{
			int sum=num1+num2;
			System.out.print(sum+" ");
			count++;
			num1=num2;
			num2=sum;
		}
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSeries(n);
		
	}

}
