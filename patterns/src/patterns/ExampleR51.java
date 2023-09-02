package patterns;

public class ExampleR51 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j==1||i==1||(j==6&&i!=5)||(i==4)||(i==j&&(i==5||i==6))) {
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
