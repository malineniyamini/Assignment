package Testing;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Assignment.DaewooTruck;
import Assignment.FordTruck;
import Assignment.NissanTruck;
import Assignment.Truck;

public class junittestTruck {
	Truck t1=new Truck();
	@Test
	
	public void testcalculatetoll()
	{
		int cash;
		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
		cash=t1.calculateToll(ford);
		assertEquals(cash, 145);
		
	}
	public void testNissancalculatetoll()
	{
		int cash;
		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
		Truck t1=new Truck();
		cash=t1.calculateToll(nissan);
		assertEquals(cash, 60);
		
	}
	public void testdaewoocalculatetoll()
	{
		int cash;
		Truck daewoo = new DaewooTruck(6, 17000);// 6 axles and 17000 kilograms
		Truck t1=new Truck();
		cash=t1.calculateToll(daewoo);
		assertEquals(cash, 200);
	}
	
}