import java.util.Scanner;
public class Biggest_Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A,B and C value");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = (a>b && a>c ) ? a :(b>a && b>c) ? b:c;
		System.out.println("Big number is : "+d);
	}

}
