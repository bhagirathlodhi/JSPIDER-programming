import java.util.Scanner;

public class NextLine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println("enter one more string");
		String c = sc.nextLine();
		System.out.println(c);
	}

}
