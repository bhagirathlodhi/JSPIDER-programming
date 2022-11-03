//Q-to return Nth biggest element 
public class Array_nth_biggest_Element {
	public static void main(String[] args) {
		int ar[]= {23,56,35,45,29};
		 int bg=nthBiggest(ar,3);
		 System.out.println("3rd Biggest is :"+bg);
		 bg=nthBiggest(ar,4);
		System.out.println("4th Biggest is :"+bg);
	}
	static int nthBiggest( int ar[],int n)
	{ 
		
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
				return ar[i];
		}   
		return -1;
	}
}
