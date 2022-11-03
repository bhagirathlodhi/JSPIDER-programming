import java.util.Scanner;
public class fibonacciseries {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.");
    int n = sc.nextInt();
    int a =0,b=1;
    while(a<=n)
    {
    	System.out.print(a+" ");
    	int c=a+b;
    	a=b;
    	b=c;
    	n--;
    }
	}

}
