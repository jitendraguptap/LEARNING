package prime_Numbers_Printer;
import java.util.*;
public class Prime_Numbers_Printer{
	public static void main(String[]args) {
		System.out.println("START");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printprimes(n);
		System.out.println();
		System.out.println("END");
	}
	public static void printprimes(int n) {
		int count=0;
		for(int i=3;count<n;i++)
		{
			boolean res=checkprime(i);
			if(res==true) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
		public static boolean checkprime(int n)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			
			}
			return true;
		
		}
	}

	