package lesson22;

public class Zad4 {

	public static void main(String[] args) {
		int n = 1;
		int k = 3;
		int i = 11;
		int a=0;
		while (n < 1000) {
			if (n%k==0 && n%i==0) {
				a++;
			}
		   		n++;
		}
		System.out.print(a);
	

	}

}
