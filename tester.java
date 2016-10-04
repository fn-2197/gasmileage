
public class tester {

	public static void main(String [ ] args )
	{
	
	automobile myBmw = new automobile(24);


	myBmw.fillup(20);


	myBmw.taketrip(100);

	
	double fuel_left = myBmw.reportFuel();

	
	System.out.println(fuel_left);
	}
	
	
}
