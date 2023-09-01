package power_Of_Two;
import java.util.*;
public class Power_Of_Two {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=scan.nextInt();
		Check pwr=new Check();
		int res=pwr.PowerOfTwo(n);
		System.out.println(res);
	}

}
