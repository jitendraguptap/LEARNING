package temperature_Conversion;
import java.util.*;
public class Temperature_Conversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("select an option");
		System.out.println("1.convert Celsius to Fahrenheit");
		System.out.println("2.convert Fahrenheit to Celsius");
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter Temperature in celsius");
				double celsius=scan.nextDouble();
				double fah=celsiusToFahrenheit(celsius);
				System.out.println(celsius +" degrees celsius "+ " is equivalent to "+fah +" degrees fahrenheit ");
				break;
		case 2:
			
			System.out.println("Enter Temperature in fahrenheit");
			double fahrenheit=scan.nextDouble();
			double cel=fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit +" degrees fahrenheit "+ " is equivalent to "+cel +" degrees celsius ");
			break;
		default:
			System.out.println("Error:we provide two options only 1 and 25 ");
		}
		
		
	}
			public static double celsiusToFahrenheit(double celsius) {
				double fah=(celsius*9/5)+32;
				return fah;
				
			}
	
		
			public static double fahrenheitToCelsius(double fahrenheit) {
				double celsius=(fahrenheit-32)*5/9;
				return celsius;
				
			}
}
		