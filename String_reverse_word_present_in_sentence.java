import java.util.Scanner;

public class String_reverse_word_present_in_sentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Sentence...");
		String str=sc.nextLine();
		String change=ChangeLastetter_Capital(str);
		System.out.println(change);
	}

	private static String ChangeLastetter_Capital(String str) {
		char ch[]=str.toCharArray();
		String rev ="";
		for(int i=0;i<ch.length;i++)
		{
			int f=i;
			while(i<ch.length&&ch[i]!=0)
			{
				i++;
			}
			int l=i-1;
			while(l>=f)
			{
				rev=rev+ch[l];
				l--;
			}
			if(i<ch.length)
				rev=rev+ch[i];
		}

     String str1=new String(ch);
     return str1;
	}

}
