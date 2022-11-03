import java.util.Scanner;
public class Number_Converstion {
      static String DesToBin(int n)
       { String str = "";
       do {
    	   int d = n%2;
    	   str = d+str;
    	   n = n/2;
       }while(n!=0);
	    return str;
       }
      static String DecToOct(int n)
      {
    	  String str="";
    	  do {
    		  int d= n%8;
    		  str = d+str;
    		  n = n/8;
    	  }while(n!=0);
    	  return str;
      }
      static String DecToHexa(int n)
      {
    	  String str = "";
    	  do {
    		  int d = n%16;
    		  if(d<9 )
    		  str =d+str;
    		  else if(d==10)
    			  str = 'A'+str;
    		  else if(d==11)
    			  str = 'B'+str;
    		  else if(d==12)
    			  str = 'c'+str;
    		  else if(d==13)
    			  str = 'D'+str;
    		  else if(d==14)
    			  str = 'E'+str;
    		  else
    			  str = 'F'+str;
    		  n = n/16;
    	  }while(n!=0);
    	  return str;
      }
      
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String dec = DesToBin(n);
		String oct = DecToOct(n);
		String hex = DecToHexa(n);
		System.out.println("Binary equalent is :"+dec);
		System.out.println("Octal equalent is :"+oct);
		System.out.println("Hexadecimal equalent is :"+hex);
	}

}
