import java.util.Objects;

class Compare_toString {
	int id;
	String name;
	public Compare_toString(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compare_toString other = (Compare_toString) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	public static void main(String[] args) {
		Compare_toString c=new Compare_toString(1233, "dev");	
		//System.out.println(c);
		Compare_toString c1=new Compare_toString(123,"dev");
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
	}
	

}
