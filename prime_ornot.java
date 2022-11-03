import java.util.Scanner;
public class prime_ornot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		boolean rs = isprime(number);
		if(rs)
			System.out.println(number+" is prime :");
		else
			System.out.println(number+" is not prime");
		int sum = 0;
		 //sum of prime number
		for(int i = 2;i<=number;i++)
		{ 
			if(isprime(i)==true)
				sum = sum+i;
				
		}
		System.out.println("sum is :"+sum);
	}
	static boolean isprime(int n)
	{ 
		for(int i = 2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
			
		}
		
			return true;
		
	}
}
