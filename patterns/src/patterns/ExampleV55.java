package patterns;

public class ExampleV55 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				if((i==1&&(j==1||j==10))||(i==2&&(j==2||j==9))||(i==3&&(j==3||j==8))||(i==4&&(j==4||j==7))||(i==5&&(j==5||j==6))) {
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
