package lesson26;

public class Zad2 {

	public static void main(String[] args) {
		int a [] = new int[] {12,9,4,1,2,18,13,16,2,6,8,5,15,14,20,19,17,2,10,3,11,7 };
		int dano=2;
		int n=0;
		System.out.print("Число "+dano+" є на позиціях");
		for(int i=0; i<a.length; i++) {
			 if(a[i]==dano) {
				 System.out.print(" "+i);
				 n=n+1;
			 }
		}
		System.out.print(". Та з'являється таку кількість разів: "+n+".");
			 }

	}


