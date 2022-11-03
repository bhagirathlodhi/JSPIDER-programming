import java.util.Scanner;

public class Pettern18 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int x=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x=x+n-j;
			}
			System.out.println();
		}
	}
}
