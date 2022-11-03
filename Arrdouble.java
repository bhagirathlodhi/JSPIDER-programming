import java.util.Scanner;

public class Arrdouble {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size :");
		double n=sc.nextDouble();
		double ar[] = new double[(int)n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextDouble();
		}
		double small = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			
			small = ar[i];
		}
		System.out.println(small);
	 
	}
	

}
