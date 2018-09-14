package Assignment;

/**
 * 
 * @author Yamini
 * 
 */
import java.util.Scanner;


public class tollBooth {
	// main method 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1.calculating toll");
		System.out.println("2.Exit");
		int choice = input.nextInt();
		Truck booth = new Truck();
		if (choice == 1) {
			int cash;
			Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
			Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
			Truck daewoo = new DaewooTruck(6, 17000); // É.
			cash = booth.calculateToll(ford);
			booth.displayData(cash);
			cash = booth.calculateToll(nissan);
			booth.displayData(cash);
			cash = booth.calculateToll(daewoo);
			booth.displayData(cash);

		} else {
			booth.totaldisplay(); //displaying the total of calculated tolls
			booth.reset();
		}
		if (choice == 1)
			main(args);
	}
}