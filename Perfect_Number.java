import java.util.Scanner;
public class Perfect_Number {
	static boolean isperfect(int n)
	{//n=7
		int sum = 0;
		for(int i =1;i<=n/2;i++)
		{
			if(n%i==0)
				sum = sum+i;
		}
		if(sum==n)
			return true;
		else
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		boolean rs = isperfect(number);
		
		if(rs)
		System.out.println(number+" number is perfect");
		else
			System.out.println(number+" is not perfect");
		
	}

}
