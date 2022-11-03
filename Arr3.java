
public class Arr3 {
	public static void main(String[] args) {
		int arr[] = {56,23,12,53,47};
		//int j=arr.length;
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
			if(arr[i]%2==0)
			System.out.println(arr[i]+" is even number");
			else
				System.out.println(arr[i]+" is odd number");
		}
		System.out.println("sum is :"+sum);
		System.out.println("AVG is :"+sum/arr.length);
	}

}
