class A
{
	A()
	{
		System.out.println(Messages.getString("Constructor.0")); //$NON-NLS-1$
	}
}

class B extends A
{
	B()
	{
		
		System.out.println(Messages.getString("Constructor.1")); //$NON-NLS-1$
	}
}
public class Constructor extends B {
	 public static void main(String[] args) {
		Constructor c=new Constructor();
//		B b =new B();
	}
	
	public Constructor() {
		System.out.println(Messages.getString("Constructor.2")); //$NON-NLS-1$
	}

}
