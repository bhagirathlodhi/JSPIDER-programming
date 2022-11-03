import java.util.Scanner;
public class Strong_or_note {
	static int fact(int n)
		{
			int fact = 1;
			while(n>1)
			{
				fact = fact*n;
				n--;
			}
			return fact;
		}
	static boolean isStrong(int num)
	{
		int sum = 0,temp=num;
		do {
			int d = num%10;
			sum = sum+fact(d);
			num = num/10;
		}while(num!=0);
		if(sum==temp)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		boolean rs = isStrong(number);
		if(rs)
			System.out.println(number+" is Strong");
		else
			System.out.println(number+" is not strong");
		
	
//	
	}

}
