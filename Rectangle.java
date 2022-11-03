import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rectangle length :");
		double length = sc.nextDouble();
		System.out.println("Enter rectangle width");
		double width = sc.nextDouble();
		double area = length*width;
		System.out.println(" area of Rectangle :"+area);
		double peri = (2*length)+(2*width);
		System.out.println("perimeter of Rectangle "
				+ " :"+peri);
		

	}

}
