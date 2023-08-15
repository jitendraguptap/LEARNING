package method_Overloading_Calculator;
import java.util.*;
public class Method_Overloading {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter an operator to perform particular operation for 2 numbers");
		String opt=scan.next();
		switch(opt) {
		case "+":
			System.out.println("Enter 2 numbers");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			int add=calculate(num1,num2);
			System.out.println("The addition result is "+add);
			break;
		case "-":
			System.out.println("Enter 2 numbers");
			float x=scan.nextFloat();
			float y=scan.nextFloat();
			float sub=calculate(x,y);
			System.out.println(sub);
			break;
		case "*":
			System.out.println("Enter 2 numbers");
			float a=scan.nextFloat();
			float mul=calculate(a);
			System.out.println(mul);
			break;
		case "/":
			System.out.println("Enter 2 numbers");
			float div=calculate();
			System.out.println(div);	
			
		}
	}
public static int calculate(int num1,int num2) {
	return num1+num2;
}
public static float calculate(float num1,float num2) {
	return num1-num2;
}
public static float calculate(float num1) {
	Scanner scan=new Scanner(System.in);
	float num2=scan.nextFloat();
	return num1*num2 ;
	
}
public static float calculate() {
	Scanner scan=new Scanner(System.in);
	float num1=scan.nextFloat();
	float num2=scan.nextFloat();
	return num1/num2;
}

}
