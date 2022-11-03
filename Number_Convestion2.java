import java.util.Scanner;
public class Number_Convestion2 {
	static int OctToDec(int n)
	{
		  int dec = 0,pw=1;
		do {
			int r= n%10;
			dec = dec+r+pw;
			pw = pw*8;
			n = n/8;
			
		}while(n!=0);
		return dec;
	}
	static int BinToDec(int n)
	{
		int dec = 0,pw =1;
		do {
			int r = n%10;
			dec = dec+r+pw;
			pw = pw*2;
			n = n/10;
		}while(n!=0);
		return dec;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int dec = OctToDec(n);
		int dec1 = BinToDec(n);
		System.out.println("Decimal equalent is :"+dec);
		System.out.println("decimal equalent is :"+dec1);
		
	}

}
