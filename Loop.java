import java.util.Scanner;
public class Loop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name");
	String name = sc.next();
	for(int i = 0;i<=10;i++)
	{
		System.out.println(name);
	}
}
}
