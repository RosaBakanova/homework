package zad1;

public class Zad1 {

	public static void main(String[] args) {
		int a [] = new int[] {4, 10, 8, 8, 9, 7, 5, 9, 7, 2, 2, 7, 8, 7, 3, 9, 10, 5, 8, 4};
		int b [] = new int[] {10, 9, 2, 8, 6, 2, 7, 2, 5, 9, 10, 4, 6, 6, 2, 4, 9, 8, 6, 9};
		int c [] = new int[20];
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i] + b[i];
			System.out.print(c[i]+" ");
					}

	}		
}
