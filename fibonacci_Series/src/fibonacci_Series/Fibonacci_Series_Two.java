package fibonacci_Series;

import java.util.Scanner;

public class Fibonacci_Series_Two {
	public static void printFibonacciSeries(int n)

	{
		int num1=0;
		int num2=1;
		if(n==0) {
			System.out.print(num1+" ");
		}
		else if(n==1) {
			int res=num1+num2;
			System.out.print(num1+" "+num2+" "+res);
		}
		else 
		{
		System.out.print(num1+" "+num2+" ");
		for (int i=1;;i++)
		{
			
			int res=num1+num2;
			if(res>n) {
				break;
			}
			num1=num2;
			num2=res;
		System.out.print(res+" ");		
		}}
		}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSeries(n);
		
	}
	
}
