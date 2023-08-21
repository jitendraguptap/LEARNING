package vending_Machine_Simulator;
import java.util.*;
public class Vending_Machine_Simulator {
	public static void getProduct(String productCode)

	{
		switch(productCode){
		case "P01":
			System.out.println("coco cola");
			break;
		case "P02":
			System.out.println("Fanta");
			break;
		case "P03":
			System.out.println("JalJeera");
			break;
		case "P04":
			System.out.println("MountainDew");
			break;
		case "P05":
			System.out.println("BoatGuava");
			break;
		default:
			System.out.println("panaka");
			
		}
	

	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String productCode=scan.nextLine();
		getProduct(productCode);
	}

}
