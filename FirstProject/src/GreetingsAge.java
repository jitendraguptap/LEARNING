import java.util.*;
public class GreetingsAge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println("Enter your YOB");
		int YOB=scan.nextInt();
		Greet(name);
		int res=Age(YOB);
		System.out.println("you are "+ res+" years old");
	}
	public static void Greet(String name) {
		System.out.println("Hello "+name);
	}
	public static int Age(int YOB) {
		int age=2023-YOB;
		return age;
		
	}

}
