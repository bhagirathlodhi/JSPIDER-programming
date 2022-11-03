import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Enter a operator");
		char o = sc.next().charAt(0);
		switch(o)
		{
		case '+' :
			System.out.println("sum is :"+x+y);
			break;
		case '-' :
			System.out.println("sum is :"+(x-y));
			break;
		case '*' :
			System.out.println("sum is :"+x*y);
			break;
		case '/' :
			System.out.println("sum is :"+x/y);
			break;
		case '%' :
			System.out.println("sum is :"+x%y);
			break;
		
		}
	}

}
