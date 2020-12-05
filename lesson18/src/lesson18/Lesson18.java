package lesson18;

public class Lesson18 {

	public static void main(String[] args) {
		double price = 100;
		double sale = 0;
		int day = 6;
		int time = 3;
		switch (day)
		{
		case 6:
		case 7:
			sale = 0.2;
			break;
		}
			double total =  price * time - price * time * sale;
		System.out.println("Ціна за розмову = " + total);
		
	}

}
