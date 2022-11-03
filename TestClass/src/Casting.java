public class Casting {
	public static void main(String[] args) {
		first f=new second();
		f.show();
	}

}
class first
{
	int a=5 ,b;
	void show()
	{
		System.out.println("this is parent class");
	}
}
class second extends first
{
	void show()
	{
		System.out.println("this is child class  "+this.a);
	}
}
