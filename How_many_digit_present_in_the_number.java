import java.util.Scanner;
public class How_many_digit_present_in_the_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();//5
		int count = 0;
		do {
			int d = n%10;//5%10=5
			n = n/10;//5/10=0
			count++;
		}while(n!=0);
		System.out.println("present digit is:"+count);
	}

}
