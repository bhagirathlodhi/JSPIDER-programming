import java.util.Scanner;
public class Count_Prime {
	static int PrimeCount(int x)
	{ int count = 0;
	while(x>0)
	{ int d = x%10;
		if(d==1||d==2||d==3||d==5||d==7)
			count++;
		x=x/10;
	}
		
		 return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int pc = PrimeCount(num);
		System.out.println(pc);
	}

}
