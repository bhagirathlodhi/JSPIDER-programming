import java.util.Scanner;
public class Xylem_or_not {
	static String isXylem(int x)
	{
		int os =0,ms=0;
		os = os+x%10;
		x = x/10;
		while(x>0)
		{
			ms = ms+x%10;
			x = x/10;		
		}
		os= os+x;
		if(os==ms)
			return "Xylem";
		else
			return "phloem";		
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n= sc.nextInt();
	String rs = isXylem(n);
	System.out.println(rs);
	

}
}
