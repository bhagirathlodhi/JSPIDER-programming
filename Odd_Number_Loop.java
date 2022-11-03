import java.util.Scanner;
public class Odd_Number_Loop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n :-");
		int n =sc.nextInt();
		for(int i=1;i<=n;i=i+2)
		{
			System.out.println(i);
		}
	}

}
