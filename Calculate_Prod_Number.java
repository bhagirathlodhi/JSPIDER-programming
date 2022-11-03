import java.util.Scanner;
public class Calculate_Prod_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n and m value");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int product = m*n;
		System.out.println("product is:"+product);
		int count = 0;
		do {
			int d = product%10;
			 product = product/10;
			 count++;
			 
		}while(product!=0);
		System.out.println(" "+product);
		System.out.println("product of digit :"+count);
		

	}

}
