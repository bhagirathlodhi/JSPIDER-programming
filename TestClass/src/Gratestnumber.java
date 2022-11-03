/**/

import java.util.Scanner;
public class Gratestnumber {
	

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println("number is gratest :"+a);
			
		}
		if(b>=a && b>=c)
		{
			System.out.println("number is gratest"+b);
		}
		if(c>=a && c>=b)
		{
			System.out.println("number is gratest :"+c);
		}
		

	}

}
