package labelled_Do_While;

public class Labelled_Do_While1 {

	public static void main(String[] args) {
		
		int j=1;
	ram:	do {
		int i=1;
	laxman:	do {
			System.out.println("kodnest");
			break ram;
		}while(i<=5);
		
		}while(j<=5);
	}

}
