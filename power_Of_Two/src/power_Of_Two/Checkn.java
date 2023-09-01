package power_Of_Two;

public class Checkn {
	public int PowerOfn(int num,int n) {
		//return num^n;
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*num;
		}
		return sum;
	}

}
