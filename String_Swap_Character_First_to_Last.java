import java.util.Scanner;

public class String_Swap_Character_First_to_Last {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Sentence...");
		String str=sc.nextLine();
		String change=ChangeLastetter_Capital(str);
		System.out.println(change);
	}

	private static String ChangeLastetter_Capital(String str) {
		char ch[]=str.toCharArray();
		int first = 0;
		for(int i=0;i<ch.length;i++)
		{ 	if(i==0 &&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
			first=i;
			}
					// last index 
		else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		{
			char t=ch[i];
			ch[i]=ch[first];
			ch[first]=t;
			
		}
		
	
	}

     return str=new String(ch);
	}
	}
//ihagb en ayk