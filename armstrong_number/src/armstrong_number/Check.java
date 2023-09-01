package armstrong_number;

public class Check {

	boolean isarmstrong(int num) {
		int dc=countDigits(num);
		int original=num;
		int sum=0;
		while(num!=0) {
		int ld=num%10;
		int pwr=(int)Math.pow(ld,dc);
		sum=sum+pwr;
		num=num/10;
	}
	if(original==sum)
	{
		return true;
	}
	return false;

}
	int countDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
}
