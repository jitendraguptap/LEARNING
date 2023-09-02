package patterns;

public class Example60 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<10;j++) {
				if(j+i==6||j-i==4||i==3&&j>2&&j<8) {
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
