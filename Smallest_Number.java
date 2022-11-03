import java.util.Scanner;

public class Smallest_Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = input.nextInt();
		int b = input.nextInt();
		int str = (a<b)? a:b;
		System.out.println(str+" is small number");
	}

}
