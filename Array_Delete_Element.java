import java.util.Scanner;

public class Array_Delete_Element {
	public static void main(String[] args) {
		System.out.println("Read the first Array:");
		int a[]=ReadArray();
		System.out.println("Read second Array");
		int b[]=ReadArray();
		System.out.println("User entered first array");
		DisplayArray(a);
		System.out.println("User entered second Array");
		DisplayArray(b);
		int c[] = MergeArray(a,b);
		DeletElement(c);
	}

	private static void DeletElement(int[] c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a specifide index:");
		int index = sc.nextInt();
		int size =c.length;
		for(int i = index;i<c.length-1;i++)
		{
			c[i]=c[i+1];
			size--;
		}
		
			
		System.out.println("deleted array is :");
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		
	}

	private static int[] ReadArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter"+size+" Integer value:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		return a;
	}

	private static void DisplayArray(int[] c) {
		for(int i =0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}

	private static int[] MergeArray(int[] a, int[] b) {
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		System.out.println();
		for(int i =0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		System.out.println("merge array is");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		return c;
	}


}
