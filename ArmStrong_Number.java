import java.util.Scanner;
public class ArmStrong_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		boolean rs = isArmStrong(number);
		if(rs)
			System.out.println(number+" is Armstrong ");
		else
			System.out.println(number+" is not Armstrong");
		
	}
	static boolean isArmStrong(int n)
	{
		int sum = 0,temp=n;
		do {
			int d = n%10;
			sum = sum+d*d*d;
			n = n/10;
		}while(n!=0);
		if(temp==sum)
			return true;
		else
		return false;
	}
	
}
