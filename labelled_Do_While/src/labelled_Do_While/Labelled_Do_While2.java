package labelled_Do_While;
public class Labelled_Do_While2{
		    public static void main(String[] args) {
		        outerLoop:
		        do {
		            System.out.println("Outer loop");
		            int i = 1;
		            innerLoop:
		            do {
		                System.out.println("Inner loop: " + i);
		                i++;
		                if (i == 3) {
		                    break outerLoop; // Exit both loops when i is 3
		                }
		            } while (i <= 5);
		        } while (true);
		    }
		    

		
	}


