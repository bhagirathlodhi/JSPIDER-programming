	import java.util.Scanner;
public class Array_even_or_not {
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" even number is:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				
			}
			
//			else if(a[i]%2==1)
//			System.out.println(a[i]+" is odd");
				
		}
	}

}
