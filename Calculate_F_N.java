import java.util.Scanner;
public class Calculate_F_N {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++)
		{
			
			sum=sum+i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
