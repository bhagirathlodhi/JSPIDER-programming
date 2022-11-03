import java.util.Scanner;
public class FaboNicci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		printFib(n);
	}
	static void printFib(int n)
	{
		int f1=0,f2=1;
		while(n>0)
		{
			System.out.print(f1+" ");
			int f3 = f1+f2;//1
			f1 = f2;//1
			f2 = f3;//2
			n--;
			
		}
	}

}
