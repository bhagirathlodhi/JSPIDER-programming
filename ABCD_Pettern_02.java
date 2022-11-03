import java.util.Scanner;

public class ABCD_Pettern_02 {
	static public void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{	int ch=97;
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print((char)(ch+k));
			}
			for(int l=i-1;l>=0;l--)
			{
				System.out.print((char)(ch+l));
			}
		
			
			System.out.println();
		}
	}

}
