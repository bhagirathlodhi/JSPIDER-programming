import java.util.*;
public class Sum_of_Prime_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
				int sum = 0;
				for(int i = 2;i<=number;i++)
				{ 
					if(isprime(i)==true)
						sum = sum+i;//2+5
				}
				System.out.println("sum is :"+sum);
			}
			static boolean isprime(int n)
			{ 
				for(int i = 2;i<=n;i++)
				{
					if(n%i==0)
						return true;
					
				}
				
					return false;
				
			}
		

		
}
