import java.util.Scanner;
public class Number_swaping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b  = sc.nextInt();
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
				
				
	}

}
