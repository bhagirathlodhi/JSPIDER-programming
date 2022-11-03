
public class Arr4 {
	public static void main(String[] args) {
		int arr[] = {22,23,12,53,47};
		int j=arr.length;
		int num = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>num)
			{
				num = arr[i];
			}
		}
		System.out.println(num);
		}

}
