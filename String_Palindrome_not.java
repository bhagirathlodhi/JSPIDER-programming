import java.util.Scanner;

public class String_Palindrome_not {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please Enter any String");
		String str=sc.nextLine();
		boolean rs = isPalindrome_or_not(str);
		if(rs)
			System.out.println(str+"--> is palindrome");
		else
			System.out.println(str+"-->is not palindrome");
		System.out.println(str.length());
	}

	private static boolean isPalindrome_or_not(String str) {
		int i=0,j=str.length()-1;//madam
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
