import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		System.out.println("Enter Side");
		double side;
		Scanner	 sc	= new Scanner(System.in);
		side	=	sc.nextDouble();
		double peri=4*side;
		double	area =	side*side;
		System.out.println("perimeter is :"+peri);
		System.out.println("area is "+area);

	}

}
