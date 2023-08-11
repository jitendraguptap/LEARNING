import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Full name");
		String a = scan.nextLine();
		System.out.println("Full name is "+a);
		System.out.println("Enter your age");
		int b=scan.nextInt();
		System.out.println("Age is "+b);
		System.out.println("Enter Gender");
		String c=scan.next();
		System.out.println("Gender is "+c);
		System.out.println("Are you married?say true or false");
		boolean d=scan.nextBoolean();
		System.out.println("maritial status is "+d);
		System.out.println("Enter your branch");
		String e=scan.next();
		System.out.println("Branch is "+e);
		System.out.println("Enter your  height in feets");
		int f=scan.nextInt();
		System.out.println("Height is "+f);
		System.out.println("Enter your weight in KGs only");
		int g=scan.nextInt();
		System.out.println("Weight is "+g);
		

	}

}
