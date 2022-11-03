import java.util.Iterator;
import java.util.Scanner;

public class Arrya_Element_Present_or_not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("enter the arra element:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			//System.out.println(ar[i]);
		}
		System.out.println("inter the element for serach");
		int search=sc.nextInt();
		int in = isPresent(ar,search);
		System.out.println(search+" element present at :"+in);
				
	}

	private static int isPresent(int[] ar,int search) {
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==search)
				return i;
		}
		return -1;
	}

}
