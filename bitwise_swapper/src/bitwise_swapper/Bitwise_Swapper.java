package bitwise_swapper;
import java.util.*;
public class Bitwise_Swapper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		        int a = scan.nextInt(); // First number
		        int b = scan.nextInt(); // Second number

		        System.out.println("Before swapping:");
		        System.out.println("a = " + a);
		        System.out.println("b = " + b);
		        swapUsingBitwise(a,b);
	}
		        public static void swapUsingBitwise(int a, int b) {
		       // Swapping using a temporary variable and bitwise XOR
		        int temp = b;
		        b = temp ^ a;
		        a = a ^ b;
		        b = b ^ a;

		        System.out.println("After swapping:");
		        System.out.println("a = " + a);
		        System.out.println("b = " + b);
		        }
		    

	

}
