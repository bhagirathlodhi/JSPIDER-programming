import java.util.Scanner;

public class String_Convert_Last_char_Into_Capital {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Sentence...");
		String str=sc.nextLine();
		String change=ChangeLastetter_Capital(str);
		System.out.println(change);
	}

	private static String ChangeLastetter_Capital(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else {
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		
		return str=new String(ch);
	}

}
