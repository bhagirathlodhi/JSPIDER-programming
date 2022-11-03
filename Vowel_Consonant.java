import java.util.Scanner;
public class Vowel_Consonant {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case 'a':
			System.out.println(c+" -is vowel");
			break;
		case 'e':
			System.out.println(c+" -is vowel");
			break;
		case 'i':
			System.out.println(c+" -is vowel");
			break;
		case 'o':
			System.out.println(c+" -is vowel");
			break;
		case 'u':
			System.out.println(c+" -is vowel");
			break;
			default :
			System.out.println(c+" -is consonant");
		}
	}

}
