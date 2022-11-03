import java.util.Scanner;
public class Sum_of_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n =sc.nextInt();
		int sum = 0;
		for(int i=2;i<=n;i=i+2)
		{
			sum = sum+i;
		}
		System.out.println("sum of even :"+sum);
				
	}

}
