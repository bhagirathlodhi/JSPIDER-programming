import java.util.Scanner;

public class Array_Prime_or_note {
	public static void main(String[] args) {
		System.out.println("enter size the array");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int a[]=new int[size];
		int count=0;
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int in=0;
		System.out.println();
		System.out.println("prime number is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{	
					count++;
				}
			}
			if(count==2)
			{ in++;
				System.out.println(a[i]);
			}
			count=0;
		}
		System.out.println(in+" prime number");
		
	}
	

}
