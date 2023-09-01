package power_Of_Two;

import java.util.Scanner;

public class Power_of_n {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scan.nextInt();
		System.out.println("To the power");
		int n=scan.nextInt();
		Checkn pwr=new Checkn();
		int res=pwr.PowerOfn(num,n);
		System.out.println(res);
	}

}
