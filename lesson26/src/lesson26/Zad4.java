package lesson26;

public class Zad4 {

	public static void main(String[] args) {
		int a [] = new int[] {0, 8, -1, 2, 3, 22, 7, -6, 9, -12 };
		int sum = 0;
		int n = 0;
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0; i<a.length; i++)
			sum=sum+a[i];	  
		double arifm = sum;
		arifm = arifm/10;
		System.out.println(sum + " " + arifm);
		for(int i=0; i<a.length; i++)
			if (a[i]>=arifm) 
				n++;
		System.out.print(n);
			   }
	

	}


