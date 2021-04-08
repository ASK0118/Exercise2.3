package Exercise2p3;

import java.util.Scanner;

public class LandVehicles {

	Scanner input = new Scanner(System.in);
	
	String brand;
	int price;
	String color;
	int totprice;
	
	void printInfo(int p) {
		
		System.out.print("Enter the brand: ");
		String b = input.next();
		System.out.print("Enter the model: ");
		String m = input.next();
		System.out.print("Enter the color: ");
		String c = input.next();
		System.out.println("Price: "+ "RM " + p);
	}
	
	void calcprice(int p) {
	
		System.out.print("Enter the quantity you want to purchase: ");
		int q = input.nextInt();
		
		totprice= p*q;
		
		System.out.println("Total price of "+q+" vehicles is " + "RM "+ totprice);
	}
	
	void calBalance() {
		
		System.out.print("Enter your payment: RM ");
		int p = input.nextInt();
		
		int b = p - totprice;
		
		System.out.println("Balance: RM "+ b);
	}
	
	void calcdepreciate(int p, int y) {
		
		System.out.print("Enter the years you use the vehicle: ");
		int yuse = input.nextInt();
		System.out.println("Life expectancy: "+ y + " years");
		
		int depValue= p/y*yuse;
		int aftDep= p-depValue;
		
		System.out.println("Depreciation value: RM "+ depValue );
		System.out.println("Value of vehicle after depreciate: " + "RM " + aftDep);
	}
}
