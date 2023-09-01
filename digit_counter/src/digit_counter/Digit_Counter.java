package digit_counter;
import java.util.*;
public class Digit_Counter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		Check ch=new Check();
		int res=ch.digitcounter(n);
		System.out.println(res);
	}

}
