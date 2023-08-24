package sum_Of_Natural_Numbers_Calculator;
import java.util.*;
public class Sum_of_Natural_Numbers_Caluculator {
	public static void calculateSum(int n)

	{

	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
	System.out.println(sum);

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateSum(n);
	}

}
