import java.util.Scanner;
public class Palindrome_number {
	static boolean isPalindrome(int n)
	{ int s=0;
	int n1=n;
		while(n>0)
		{
			int d = n%10;
			s = (s*10)+d;
			n = n/10;
			
		}
		if(n1==s)
			
		return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int number = sc.nextInt();
		boolean s = isPalindrome(number);
		if(s)
			System.out.println(number+" is palindrome");
		else
			System.out.println(number+" is not palindrome");
			
	}

}
