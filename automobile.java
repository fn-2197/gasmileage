
public class automobile {
private double gallons;
private int mpg;

public automobile(int m) {
mpg = m;
gallons = 0.0;
}

public void fillup(int g1){
	gallons += g1;
}

public void taketrip(double d){
	gallons -= (d/mpg);
}
public double reportFuel(){
	return gallons;
}





}
