package patterns;

public class ExampleM46 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=8;j++) {
				if(j==1||j==8||(i==2&&(j==3||j==6))||j==4&&i==3) {
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
