package discount_Applicability;
import java.util.*;
public class Discount_applicability {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
	}
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100)
		{
			System.out.println("Discount Applicable");
		}
	
	}
	

}
