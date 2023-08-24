package number_Table_Printer;
import java.util.*;
public class Number_Table_Printer {
	public static void printTable(int num)

	{
		for(int i=1;i<=10;i++) {
			System.out.println(num+" "+"x"+" "+i+" "+"="+" "+num*i);
		}
	

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		printTable(num);
		
	}

}
