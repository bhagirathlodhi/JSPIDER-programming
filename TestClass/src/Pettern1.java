import java.util.Scanner;

public class Pettern1 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		
			for(int j=i*2;j<n*2-1;j++)
			{
				System.out.print(" ");
				
			}
			for (int l = i; l >= 1; l--)
            {
                if(l!=n)
                    System.out.print(l);
            }
			System.out.println();
		}
	
	
	}

}
