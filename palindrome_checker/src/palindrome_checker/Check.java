package palindrome_checker;

public class Check {
	public void palindromechecker(int n) {
		int original=n;
		int sum=0;
		while(n!=0) {
		int res=n%10;
		sum=sum*10+res;
		n=n/10;
	}
		if(original==sum) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
			
		}
}
}
