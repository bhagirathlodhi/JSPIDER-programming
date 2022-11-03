import java.util.Scanner;
public class Armstrong_between_n_to_m {
	static int countDigit(int n)
	{
		int count = 0;
		do{
			count++;
		n=n/10;
		}while(n!=0);
		return count;
	}

  static int pow(int n,int p)
  {
	  int pw=1;
	 while(p>0)
	 {
		 pw = pw*n;
		 p--;
	 }
	 return pw;
	 
  }
  static boolean isArmstong(int num)
  {
	  int sum=0,temp=num;
	  int dc = countDigit(num);
	  do {
		  int d = num%10;
		  sum = sum+pow(d,dc);
		  num = num/10;
	  }while(num!=0);
	  return sum ==temp;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		boolean rs = isArmstong(number);
		if(rs)
			System.out.println(number+" is armstrong");
		else
			System.out.println(number +" is not armstrong");
	}

}
