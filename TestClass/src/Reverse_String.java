import java.util.Scanner;
public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String name=sc.next();
		String s2="";
		for(int i=name.length()-1;i>=0;i--)
		{
			s2=s2+name.charAt(i);
		}
		System.out.println("Reveresed String is :"+s2);
	}

}
