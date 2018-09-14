package Assignment;

/**
 * 
 * @author Yamini
 *
 */
public class Truck {

	private int axel;
	private int weight;
	private static int total;
	private static int obtainedWeight ;
	private static int obtainedAxel;
	private static int trucks;

	public int getAxel() {
		return axel;
	}

	public void setAxel(int axel) {
		this.axel = axel;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int calculateToll(Truck truck) {
		int cash;
		int updatedweight;
		obtainedWeight= truck.getWeight();
		obtainedAxel= truck.getAxel();
		updatedweight = obtainedWeight / 1000;
		cash = (obtainedAxel * 5) + (updatedweight * 10);
		total = total + cash;
		trucks = trucks + 1;
		return cash;

	}

	public void displayData(int cash) {
		//displaying the data regarding the truck during its arrival
		System.out.println("\nTruck arrival-Axels:" + obtainedAxel + "\t" + "total weight" + obtainedWeight + "\t" + "toll due:" + cash);
	}

	public void totaldisplay() {
		//displaying the totals of calculated tolls and the number of trucks
		System.out.println("*** Collecting receipts  ***");
		System.out.println("Totals since the last collection - Receipts:" + total + "\t" + "Trucks:" + trucks);

	}

	public void reset() {
		//setting the screen values to zero after the exiting of the worker
		total = 0;
		trucks = 0;
	}

}
