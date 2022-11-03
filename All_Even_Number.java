import java.util.Scanner;
public class All_Even_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any nuber");
		int n = sc.nextInt();
		for(int i =2;i<=n;i=i+2)
		{
			System.out.println(i);
		}
		
	}

}
