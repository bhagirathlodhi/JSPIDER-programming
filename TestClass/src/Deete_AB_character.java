
public class Deete_AB_character {
	public static void main(String[] args) {
		String str= "bhagirathabba";
		String str1="";
		char ch[]=str.toCharArray();
		char c[] =new char[ch.length];
		for(int i =0;i<ch.length;i++)
		{  
			if(ch[i]!='a'&& ch[i]!='b')
			{
			c[i] =ch[i];
			}
			str = new String(ch);
		}
		System.out.println(str);
	}

}
