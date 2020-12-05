package kontrRob1;

public class KontrRob1 {

	public static void main(String[] args) {
		int a = 5; //кількість олівців - a
		int b = 1; //кількість ручок - b
		int c = 4; //кількість маркерів - c
		double pricea = 9.99; //вартість олівців - a
		double priceb = 9.99; //вартість ручок - b
		double pricec = 9.99; //вартість маркерів - c
		double sum = a * pricea + b * priceb + c * pricec; // Сумма 
		System.out.println("Загальна ціна канцелярії " + sum + " ГРН");
	}

}
