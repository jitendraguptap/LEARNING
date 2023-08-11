package conditional;
import java.util.*;
public class If {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		System.out.println("welcome to kodnest");
		Marks(marks);
		
	}
	public static void Marks(int marks) {
		if(marks>=80)
		{
			System.out.println("welcome to tech club");
		}
	}

}
