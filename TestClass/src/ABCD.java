import java.util.Scanner;

public class ABCD {
	public static void main(String[] args) {
			Scanner  sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n = sc.nextInt();
			int sp=0,st=n;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print("  ");
				}
				int x=1;
				for(int j=1;j<=st;j++)
				{
					System.out.print(charAt(64+x)+" ");
					if(j<=st/2)
						x++;
					else
						x--;
					
				}
				if(i<=n/2)
				{	sp++;
				st = st-2;
				}
				else {
					sp--;
				st=st+2;
				}
				
				System.out.println();
			}
		}

	
	}

	



