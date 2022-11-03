import java.util.Scanner;
public class Coince1 {
	static int isCon(int n)
	{
		int count = 0;
	for(int i =0;i<=n/5;i++)
	{
		for(int j=0;j<=n/2;j++)
		{
			for(int k=0;k<=n;k++)
			{
				int x=(i*5)+(j*2)+k;
				if(n==x&&i<=5&&j<=5&&k<=5)
					count=i+j+k;
				else if(x>n||i>5||j>5||k>5)
					break;
				else
					continue;
			}
		}
	}
	return count;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		int rs=isCon(n);
			 
		System.out.println(rs);

	}

}
