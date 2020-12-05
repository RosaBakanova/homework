package lesson20;

public class Zad6 {

	public static void main(String[] args) {
		int kilk=0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 || i % 11 ==0) {
			System.out.print(i + " ");
			kilk = kilk + 1;
			}
		}
		System.out.print("Кількість таких чисел " + kilk);
	}
}
