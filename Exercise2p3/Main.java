package Exercise2p3;

public class Main {

	public static void main(String[] args) {
	
		LandVehicles motorcycle = new LandVehicles();
		LandVehicles car = new LandVehicles();
		LandVehicles bike = new LandVehicles();
		LandVehicles van = new LandVehicles();
		
		System.out.println("Motorcycle Information");
		System.out.println("----------------------");
		motorcycle.printInfo(5000);
		System.out.println("");
		motorcycle.calcprice(5000);
		System.out.println("");
		motorcycle.calBalance();
		System.out.println("");
		motorcycle.calcdepreciate(5000, 10);
		System.out.println("=========================================");
		System.out.println("");
		
		System.out.println("Car Information");
		System.out.println("----------------------");
		car.printInfo(78000);
		System.out.println("");
		car.calcprice(78000);
		System.out.println("");
		car.calBalance();
		System.out.println("");
		car.calcdepreciate(78000, 7);
		System.out.println("=========================================");
		System.out.println("");
		
		System.out.println("Bike Information");
		System.out.println("----------------------");
		bike.printInfo(3000);
		System.out.println("");
		bike.calcprice(3000);
		System.out.println("");
		bike.calBalance();
		System.out.println("");
		bike.calcdepreciate(3000, 15);
		System.out.println("=========================================");
		System.out.println("");
		
		System.out.println("Van Information");
		System.out.println("----------------------");
		van.printInfo(80000);
		System.out.println("");
		van.calcprice(80000);
		System.out.println("");
		van.calBalance();
		System.out.println("");
		van.calcdepreciate(80000, 12);
		System.out.println("=========================================");
		System.out.println("");

	}

}
