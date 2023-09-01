package armstrong_number;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		Check arm=new Check();
		boolean res=arm.isarmstrong(num);
		if(res==true) {
			System.out.println("Armstrong number");
		}
		else {
		System.out.println("Not a Armstrong number");
	}
		}

}
