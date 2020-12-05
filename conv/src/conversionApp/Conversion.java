package conversionApp;

public class Conversion {

	public static void main(String[] args) {
		int a = 0b11100101;
		System.out.println(a);
		int b = 0100;
		System.out.println(b); 
		int c = 0x27;
		System.out.println(c);   
		int d = 120;
		System.out.println(Integer.toString(d,2));
		System.out.println(Integer.toString(d,8));
		System.out.println(Integer.toString(d,16));
		int x = 0b1101;
		int y = 0b1001;
		System.out.println(x + y);
		x = 0b100;
		y = 0b110;
		System.out.println(x * y);
		x = 0b10;
		a = 013;
		b = 0x15;
		System.out.println(x + a + b);
		}

}

