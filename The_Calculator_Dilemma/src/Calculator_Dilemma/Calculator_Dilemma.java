package Calculator_Dilemma;
import java.util.*;
public class Calculator_Dilemma {

	public static void main(String[] args) {
		System.out.println("Enter the number between 1 to 4...Here 1,2,3,4 performs addition,subtraction,multiplication,division respectively1");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("Entern two numbers to perform operation");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		perform_operation(num,num1,num2);
	}
	public static void perform_operation(int num,int num1,int num2) {
		switch(num) {
		case 1:
			int sum=num1+num2;
			System.out.println("The result of addition is"+""+sum);
			break;
		case 2:
			int sub=num1-num2;
			System.out.println("The result of subtraction is "+sub);
			break;
		case 3:
			int mul=num1*num2;
			System.out.println("The result of Multiplication is "+mul);
			break;
		case 4:
			int div=num1/num2;
			System.out.println("The result of division is "+div);
			break;
		default:
			System.out.println("Error...please check once again ");
			
		}
	}

}
