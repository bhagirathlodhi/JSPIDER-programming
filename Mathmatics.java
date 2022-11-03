import java.util.Scanner;
public class Mathmatics {
	int x=12,y=6;
	 void Mathmatics()
	{
		System.out.println("Mathamtics Operation");
	}
	int Sub()
	{
		System.out.println(this.Add());
		return x-y;
	}
	int Add()
	{
		return x+y;
	}
	
	int Multi()
	{
		return x*y;
	}
	double Div()
	{
		return x/y;
	}
	public static void main(String[] args) {
		Mathmatics m=new Mathmatics();
		m.Mathmatics();
		System.out.println("---------");
		int a = m.Add();
		int b = m.Sub();
	    int c = m.Multi();
	    double d = m.Div();
		System.out.println("sum is:"+a+"\nSubtraction is:"+b+" \nMultification is:"+c+"\nDivision is:"+d);
	}
	
	

}

