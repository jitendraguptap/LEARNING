package patterns;
import java.util.*;
public class Example27 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n/2||j==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
