import java.util.Scanner;
public class Divisible_or_Not {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = input.nextInt();
		// if condition
//		if(number%5==0)
//		{
//			System.out.println("number is divisible");
//			
//		}
//		else
//		{
//			System.out.println("number is not divisible");
//		}
		String str = (number%5==0)? "divisible" : "not divisible" ;
		System.out.println(str);

	}

}
