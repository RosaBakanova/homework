package lesson39;
import java.util.*;
public class View {

	public static void main(String[] args) {
	  		Scanner sc= new Scanner(System.in);
			System.out.println("operator ");  
			String oper = sc.nextLine();  
			System.out.print("Enter first number- ");  
			double num1= sc.nextDouble();  
			System.out.print("Enter second number- ");  
			double num2= sc.nextDouble();  
			Model calculator = new Model ();
			System.out.print(calculator.calculation(num1, num2, oper));
	}

}
