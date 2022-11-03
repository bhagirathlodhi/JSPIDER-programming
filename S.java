import java.util.Scanner;

public class S {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		String[] ar = new String[size];
		System.out.println("Enter Integer value :");
		int smalllength = 0;
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.next();
		}
		int max = ar[0].length();
		for(int i =1;i<ar.length;i++)
		{
			int as = ar[i].length();
			if(as<max)
				{
				max = as;
				smalllength = i;
				}
		}
		System.out.println(ar[smalllength]);
	}
}
