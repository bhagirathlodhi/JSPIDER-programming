
public class Arr1 {
	public static void main(String[] args) {
		String str[] = {"java","javaScript","sql","html","css"}; 
		int max=0;
		int digit = 0;
		for(int i=0;i<str.length;i++)
		{
			int as = str[i].length();
			if(as>max)
			{    
				max = as;
				digit =i;
			}
		}
		
		System.out.println(max+"\n High length :"+str[digit]);
//         for(String x:str)
//         {
//        	 System.out.println(x);
//		}
	}

}
