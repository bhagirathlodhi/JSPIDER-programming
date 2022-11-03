import java.util.Scanner;
public class Smallest_1In_3 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a<b && a<c)
			System.out.println(a+"is smallest");
		
		else if(b<a && b<c)
			System.out.println(b+" is smallest");
		else
			System.out.println(c+" is smallest");
	}

}
