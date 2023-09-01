package palindrome_checker;
import  java.util.*;
public class Palindrome_Checker {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Check p=new Check();
		p.palindromechecker(n);
	}

}
