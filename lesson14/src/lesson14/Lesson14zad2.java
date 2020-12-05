package lesson14;

public class Lesson14zad2 {

	public static void main(String[] args) {
		double a = 3;
		double b = 3;
		double c = 3;
		double x1;
		double x2;
		double d = b * b - 4 * a * c;
		if (d<0) 
			System.out.println("Корнів нема");
		else {
			x1 = (- b + Math.sqrt(d) ) / (2 * a);
			x2 = (- b - Math.sqrt(d)) / (2 * a);
			System.out.println("Корні кв. рівн. " + x1 + " " + x2);
		}
	}

}
