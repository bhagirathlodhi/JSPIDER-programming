import java.util.Scanner;
public class Month_Name_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month name :");
		String month = sc.nextLine();
		switch(month)
		{
		case "january":
			System.out.println("month number :-	1 and days: 31");
			break;
		case "february":
			System.out.println("month number:-	2 and days: 28 & 29");
			break;
		case "march":
			System.out.println("month number:-	3 and days: 31");
			break;
		case "april":
			System.out.println("month number:-	4 and days: 30 ");
			break;
		case "may":
			System.out.println("month number:-	5 and days: 31");
			break;
		case "june":
			System.out.println("month number:-	6 and days:-30");
			break;
		case "july":
			System.out.println("month number:-	7 and days: 31");
			break;
		case "aguast":
			System.out.println("month number:-	8 and days: 31");
			break;
		case "siptember":
			System.out.println("month number:-	9 and days: 30");
			break;
		case "october":
			System.out.println("month number:-	10 and days: 31");
			break;
		case "navember":
			System.out.println("month number:-	11 and days: 30");
			break;
		case "december":
			System.out.println("month number:-	12 and days: 31");
			break;
		
		}

}
}
