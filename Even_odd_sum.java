import java.util.Scanner;
public class Even_odd_sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter value of n:");
	    int n=sc.nextInt();
	    int ecount = 0;
	    int ocount = 0;
	    int esum= 0;
	    int osum =0;
	    do {
	    	if(n%2==0) {
	    	esum=esum+n;
	    	ecount++;
	    	}
	    	else
	    	{
	    		osum=osum+n;
	    		ocount++;
	    	}
	    	n--;
	    }while(n!=0);
	    System.out.println("count of even :"+ecount);
	    System.out.println("sum of even :"+esum);
	    System.out.println("count of odd :"+ocount);
	    System.out.println("sum of odd :"+osum);

	}

}
