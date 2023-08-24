package even_Number_Printer;
import java.util.*;
public class Even_Number_Printer {
	public static void printEvenNumbers(int n)

	{
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		printEvenNumbers(num);
	}

}
