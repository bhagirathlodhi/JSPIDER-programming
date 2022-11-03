import java.util.Scanner;
public class Simple_Intrest {

	public static void main(String[] args) {
		System.out.println("Enter your Amount :");
		int Amount;
		double rate;
		int time;
		Scanner sc=new Scanner(System.in);
		Amount=sc.nextInt();
		System.out.println("Enter your intrest_rate :");
		rate=sc.nextInt();
		System.out.println("Enter your Time :");
		time=sc.nextInt();
		
		double intrest=(Amount*rate*time)/100;
		System.out.println("intrest is"+intrest);
		double amount2	=	Amount+intrest;
		double compound_intrest	=	(amount2*rate*time)/100;
		System.out.println("Compound intrest is"+compound_intrest);
		
	}

}
