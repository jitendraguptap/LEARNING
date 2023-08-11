package loops;

public class Loops {
	public static void main(String[]args) {
		for (int i=11;i<=20;i++) {
			System.out.println(i+" Kodnest");
		}
		System.out.println("While output");
		whil();
		System.out.println("DO-while output");
		dowhil();
	}
	public static void whil() {
		int i=11;
		while(i<=20) {
			System.out.println(i+" Kodnest");
			i++;
		}
		
	}
	public static void dowhil() {
		
		int i=11;
		do {
			System.out.println(i+" Kodnest");
			i++;
		}while(i<=20);
	}

}
