import java.util.Scanner;

public class First10_Prime_Number {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int i,x=2,a=0;
	int rr[] =new int[n];
	while(n>0)
	{
		
		for(i=2;i<x;i++)
			if(x%i==0)
				break;
		if(i==x)
		{
//			System.out.println(x+" ");
			rr[a]=x;
			n--;
			a++;
		}
		x++;
	}
	for(int l= 0;l<rr.length;l++)
	{
		System.out.println(rr[l]);
	}
}
}
