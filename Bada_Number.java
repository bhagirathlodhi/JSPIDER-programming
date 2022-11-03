import java.util.Scanner;
public class Bada_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();
		int big = a;
		if(big<b)
			big=b;
		if(big<c)
			big=c;
		System.out.println(big+" is big");
	}

}
