package Assignment;

import Assignment.Truck;

/**
 * 
 * @author 
 *
 */
public class NissanTruck extends Truck {
	private int axel;
    private int weight;
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
	
	public NissanTruck(int i, int j) {
		// TODO Auto-generated constructor stub
		this.axel=i;
		this.weight=j;
	}

}

