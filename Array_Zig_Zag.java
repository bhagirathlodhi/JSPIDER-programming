import java.util.Scanner;

public class Array_Zig_Zag {
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
		System.out.println("Zigzag  Array :");
		DisplayArray(c);
	}

//	private static void ZigZag(int[] c) {
//		int temp=0;
//		boolean tu = true;
//		for(int i=0;i<c.length-2;i++)
//		{
//		if(tu) 
//		{
//			if(c[i]>c[i+1])
//				{
//				temp=c[i];
//				c[i]=c[i+1];
//				c[i+1]=temp;
//		
//				}	
//		}	
			
//}
//		for(int i=0;i<c.length;i++)
//		
//			System.out.print(c[i]+" ");
//		
//		}

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
		int i=0,k=0;
		while(i<a.length&&i<b.length)
		{
			c[k]=a[i];
			k++;
			c[k]=b[i];
			k++;
			i++;
		}
		while (i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length)
		{
			c[k]=b[i];
			k++;
			i++;
			
		}
		return c;
	}

}
