import java.util.Scanner;
public class Product_of_Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value n:");
		int n = sc.nextInt();
		int product =1;
		for(int i=1;i<=n;i=i+2)
		{
			product = product*i;
		}
		System.out.println("Odd product is :"+product);
	}
}
