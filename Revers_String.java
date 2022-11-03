import java.util.Scanner;
public class Revers_String {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String str = sc.next();
		System.out.println(str.length());
		
		for(int i=str.length()-1; i>=0; i--)
			
			System.out.print(str.charAt(i));
	}

}
