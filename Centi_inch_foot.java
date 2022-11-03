import java.util.Scanner;
public class Centi_inch_foot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Distance in centimeter");
		float cm = input.nextFloat();
		double inches = (cm/2.54);
		double foots = cm/30.48;
		double meter = cm/100;
		System.out.println(cm+" centimeter in inches "+inches);
		System.out.println(cm+" centimeter in foots "+foots);
		System.out.println(cm+" centimeter in meter "+meter);
		
	}

}
