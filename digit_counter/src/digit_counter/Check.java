package digit_counter;

public class Check {

	public int digitcounter(int n) {
		int count=0;
		while(n!=0) {
			int ldigit=n%10;
			count++;
			n=n/10;
			
		}
	
		return count;
		
	}

}
