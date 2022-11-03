import java.util.Scanner;
public class Big_Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = (a>b) ? a : b;
		System.out.println(c+" is big ");
	}

}
