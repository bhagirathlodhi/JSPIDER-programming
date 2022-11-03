import java.util.Scanner;
public class Biggest_digit_in_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int num = getbiggest(number);
		System.out.println(num+" is big");
				
	}
	static int getbiggest(int n)//456
	{
		int big = n%10;
		do {
			int d = n%10;
			if(d>big)
				big=d;
			n=n/10;
		}while(n!=0);
		return big;
	}

}
