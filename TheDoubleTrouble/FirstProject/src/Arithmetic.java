import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		long res=galacticAddition(num1,num2);
		System.out.println(res);
	}
	public static long galacticAddition(long num1,long num2) {
		
		long sum=num1+num2;
		return sum;
	}
	}


