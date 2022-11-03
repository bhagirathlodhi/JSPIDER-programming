import java.util.Scanner;
public class Student_bhagi {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter math marks :");
	int math = input.nextInt();
	System.out.println("Enter phisics marks :");
	int phisics = input.nextInt();
	System.out.println("Enter english marks :");
	int english = input.nextInt();
	System.out.println("Enter chemistry marks :");
	int chemistry = input.nextInt();
	double total =(math+phisics+english+chemistry);
	double result = (math+phisics+english+chemistry)*100/400;
	System.out.println(result);
//	System.out.println(total);
	if(result>=85)
		System.out.println("Distension");
	else if(result>=60)
		System.out.println("First division");
	else if(result>=50)
		System.out.println("2nd Division");
	else if(result<35)
		System.out.println("fail");
	
}
}
