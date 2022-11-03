import java.util.Scanner;
public class Month_Day {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month number");
		int month = sc.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("month name :-	January and days:-31");
			break;
		case 2:
			System.out.println("month name :-	February and days:-28 & 29");
			break;
		case 3:
			System.out.println("month name :-	march and days:-31");
			break;
		case 4:
			System.out.println("month name :-	April and days:-30 ");
			break;
		case 5:
			System.out.println("month name :-	May and days:-31");
			break;
		case 6:
			System.out.println("month name :-	Jun and days:-30");
			break;
		case 7:
			System.out.println("month name :-	July and days:-31");
			break;
		case 8:
			System.out.println("month name :-	Aguast and days:-31");
			break;
		case 9:
			System.out.println("month name :-	Siptmber and days:-30");
			break;
		case 10:
			System.out.println("month name :-	October and days:-31");
			break;
		case 11:
			System.out.println("month name :-	navember and days:-30");
			break;
		case 12:
			System.out.println("month name :-	December and days:-31");
			break;
		
		}
	}

}
