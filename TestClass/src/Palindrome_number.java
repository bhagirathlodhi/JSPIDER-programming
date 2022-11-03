import java.util.*;
public class Palindrome_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int r=0,sum=0,c=n;
		while(n>0)
		{
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		if(c==sum)
			System.out.println(c+" is palindrome");
		else
			System.out.println(c+" is not palindrome");
		
	}

}
