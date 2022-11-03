import java.util.Scanner;
public class Tempreture {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the celsius value :");
		float celsius = input.nextFloat();
		float fahrenheit = (celsius*9/5)+32;
		System.out.println("Temperature converted to fahrenheit :"+fahrenheit);

	}

}
