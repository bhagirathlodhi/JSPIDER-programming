import java.util.*;
class FoodStalls{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int nsum = foodStall(n,m);
		/** Storing in sets so to store only those color 
		numbers that stall supports ([i][j] == 1)*/
		System.out.println(nsum);
		
	}
	static int foodStall(int n,int m)
	{	
		Scanner sc = new Scanner(System.in);
		ArrayList<HashSet<Integer>> stallSet 
		= new ArrayList<HashSet<Integer>>(m);
ArrayList<HashSet<Integer>> personSet 
		= new ArrayList<HashSet<Integer>>(n);
for(int i=0;i<m;i++){
stallSet.add(new HashSet<Integer>());
for(int j=0;j<10;j++){
if(sc.nextInt()==1)
	stallSet.get(i).add(j);
}
}
for(int i=0;i<n;i++){
personSet.add(new HashSet<Integer>());
for(int j=0;j<10;j++){
if(sc.nextInt()==1)
	personSet.get(i).add(j);
}
}
int q = sc.nextInt();
int sum =0;
for(int i=0;i<q;i++){
int r = sc.nextInt();
int c = sc.nextInt();

/** If personSet and stallsSet 
* intersect then add 1 to sum */

Set<Integer> intersection 
		= new HashSet<>(personSet.get(r-1));

intersection.retainAll(stallSet.get(c-1));
if(!intersection.isEmpty()){
sum += 1;
}
}

return sum;
	}

}
