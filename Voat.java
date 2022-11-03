import java.util.Scanner;
public class Voat {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner input=new Scanner(System.in);
		int Age = input.nextInt();
		if(Age>=18)
			System.out.println("You elegible for bote");
		else
			System.out.println("you not elgible for bote");
		

	}

}
