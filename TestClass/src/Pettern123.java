import java.util.Scanner;

public class Pettern123 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int  count = 1;
		for(int i=1;i<=n;i++)
		{	
			for(int j=1;j<=3;j++)
			{
				
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
