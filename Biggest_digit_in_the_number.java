import java.util.Scanner;
public class Biggest_digit_in_the_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		int r = 0;
		int l = 0;
		do {
			r = n%10;//897
			if(r>l)
				l=r;
			n=n/10;
			
			
		}while(n!=0);
		System.out.println("biggest number is :"+l);

	}

}
