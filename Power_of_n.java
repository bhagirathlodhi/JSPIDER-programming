import java.util.Scanner;
public class Power_of_n {
	static int pow(int n1,int p1)
	{
		int prod =1;
		while(p1>0)
		{
			prod = n1*prod;
			p1--;
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("enter the power");
		int p = sc.nextInt();
		int p2= pow(n,p);
		System.out.println(p2);
		
	}

}
