import java.util.Scanner;
class Disarium_or_not {
	static int countDigit(int x)
	{
		int count = 0;
		do {
			count++;
			x=x/10;
			
		}while(x!=0);
		return count;
	}
	static boolean isDisariumorNot(int n)
	{
		int sum =0,temp=n;
		int dc = countDigit(n);
		do {
			int d = n%10;
			sum = sum+power(d,dc);
			dc--;
			n=n/10;
		}while(n!=0);
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		boolean rs = isDisariumorNot(n);
		if(rs)
			System.out.println(n+" is Disarium number");
		else
			System.out.println(n+" is not Disarium number");
		
		
	}
	
	static int power(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

}
