/*import java.util.*;
public class Greetings {

	public static void main(String[] args) {
		Greet();


	}
	public static void Greet() {
		Scanner scan=new Scanner(System.in);
		String st= scan.next();
		System.out.println("Hello "+st+"...How are you..");
	}

}*/
import java.util.*;
public class Greetings{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		
		Greet(st);
	}
	public static void Greet(String st) {
		System.out.println("Hello "+st+"...How are you..");
	}
	
}
