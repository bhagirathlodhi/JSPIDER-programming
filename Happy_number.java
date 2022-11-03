import java.util.Scanner;
public class Happy_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number...");
		int n=sc.nextInt();
		boolean rs = isHappy(n);
		if(rs)
			System.out.println(n+" is happy number---");
		else
			System.out.println(n+" is not Happy number--");
	}

	private static boolean isHappy(int n) {
		while(n>9)
		{
			int sum = 0;
			do {
				int d = n%10;
				sum = sum+d*d;
				n = n/10;
			}while(n!=0);
			n=sum;
		}
		return n==1||n==7;
	}
}
