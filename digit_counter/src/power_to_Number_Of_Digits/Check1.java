package power_to_Number_Of_Digits;

public class Check1 {
	
		public int digitcounter(int num) {
			int count=0,sum=1;
			int original=num;
			while(num!=0) {
				int ldigit=num%10;
				count++;
				num=num/10;
			}
			return count;
		}
			public int power(int count,int num)
			{
			int sum=1; 
			for(int i=1;i<=count;i++){
				sum=sum*num;
			}
			
			
			return sum;
		}
	}

