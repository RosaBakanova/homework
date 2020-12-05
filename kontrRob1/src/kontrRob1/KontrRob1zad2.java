package kontrRob1;

public class KontrRob1zad2 {

	public static void main(String[] args) {
		int a = 639;										// Дане
		String astr = Integer.toString(a); 					// Переводимо в стринг
		char sot = astr.charAt(0);							// Беремо сотні
		char od = astr.charAt(2);							// Беремо одиниці
		String aizm = od + astr.substring(1,2) + sot;		// новий стринг з сотнями та одиницями поміняними
		a = Integer.parseInt(aizm);							// переводимо в цілі числа
		System.out.println(a);								// вивід

	}

}
