import java.util.Scanner;
public class Greatest_In3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any three number");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is greates");
			else
				System.out.println(c+" is greatest");
		}
		else
		{
			if(b>c)
				System.out.println(b+" is greatest");
			else
				System.out.println(c+" is greatest");
		}

}
}
