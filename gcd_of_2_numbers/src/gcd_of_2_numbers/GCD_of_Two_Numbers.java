package gcd_of_2_numbers;
import java.util.*;
/*public class GCD_of_Two_Numbers {
	public static void findGCD(int a, int b)

	{
		for(int i=2;i<=a&&i<=b ;i++) {
		if(a%i==0&&b%i==0) {
					System.out.print(i+" ");
					
				
				}
			}
		}
		
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		findGCD(num1,num2);
		
	}

}*/
public class GCD_of_Two_Numbers{
	
public static void main(String[] args) {
	
			Scanner scan=new Scanner(System.in);
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			findGCD(num1,num2);	
	}
public static void findGCD(int a,int b)
{
	while(b!=0) {
		int rem=a%b;
		a=b;
		b=rem;
		
	}
	System.out.println(a);
}
	
}

