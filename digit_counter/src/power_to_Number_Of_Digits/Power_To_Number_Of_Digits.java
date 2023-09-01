package power_to_Number_Of_Digits;
import java.util.*;

import digit_counter.Check;
public class Power_To_Number_Of_Digits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		Check1 ch=new Check1();
		int count=ch.digitcounter(num);
		//System.out.println(count);
		int res=ch.power(count,num);
		System.out.println("number of digits in a number is "+count+" and the power of number of digits of a number is "+res);
	}

}
