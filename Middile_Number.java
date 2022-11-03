import java.util.Scanner;
public class Middile_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y && x<z ||x>z&&x<y )
			System.out.println(x+" is the middile number");
		if(y>x && y<z ||y>z&&y<x )
			System.out.println(y+" is the middile number");
		else 
			System.out.println(z+" is middile");
	}
}
