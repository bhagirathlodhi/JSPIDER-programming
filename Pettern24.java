import java.util.Scanner;

public class Pettern24 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=1;
			for(int j=i;j<=i;j++)
			{
				System.out.print(j+" ");
			
			}
			
			
			System.out.println();
		}
	}

}
