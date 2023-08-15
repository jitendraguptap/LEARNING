package tax_calculator;
import java.util.*;
public class Tax_Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double purchase_amount=scan.nextDouble();
		System.out.println("Enter the tax rate");
		double tax_rate=scan.nextDouble();
		double total_cost=calculateTotalWithTax(purchase_amount,tax_rate);
		System.out.println("Total cost including tax: "+ total_cost);
		
		
	}
	public static double calculateTotalWithTax(double purchase_amount,double tax_rate) {
		return purchase_amount+purchase_amount*tax_rate;
	}

}
