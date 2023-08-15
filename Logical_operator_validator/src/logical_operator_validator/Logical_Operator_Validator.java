package logical_operator_validator;
import java.util.*;

public class Logical_Operator_Validator {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a valid input");
		boolean valid_input=scan.nextBoolean();
		boolean condition=scan.nextBoolean();
		boolean valid=isValidInput(valid_input,condition);
		if (valid) {
			System.out.println("Input is valid");
		}
		else {
			System.out.println("Input is not valid");
		}
		
	}
	public static boolean isValidInput(boolean valid_input, boolean condition) {
		
		if(valid_input==true&condition==true) {
			return true;
			
		}
		else {
			return false;
			
		}
	}

}
