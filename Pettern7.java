import java.util.Scanner;

public class Pettern7 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
//enter the number
//5
//5 4 3 2 1 0 
//5 4 3 2 1 0 
//5 4 3 2 1 0 
//5 4 3 2 1 0 
//5 4 3 2 1 0 

