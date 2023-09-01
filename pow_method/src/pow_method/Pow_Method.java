package pow_method;
import java.util.*;
public class Pow_Method {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int base=scan.nextInt();
		int exp=scan.nextInt();
		int res=(int)Math.pow(base,exp);
		System.out.println(base+" raised to the power of "+ exp+" is: "+res);
		
	}

}
