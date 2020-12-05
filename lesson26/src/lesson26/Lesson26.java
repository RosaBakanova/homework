package lesson26;

public class Lesson26 {

	public static void main(String[] args) {
		int a [] = new int[] {0, 8, -1, 2, 3, 22, 7, -6, 9, -12 };
		int max=0;
		int min=0;
		for(int i=0; i<a.length; i++)
			   System.out.print(a[i]+" ");
			  System.out.println();
			  for(int n=0; n<a.length; n++)
			   if(a[n]>max){
			    max=a[n];
			   }
			   else{
			    if(a[n]<min){
			     min=a[n];
			    }
			   }
			  System.out.println(max + " максимальний елемент масиву" );
			  System.out.println(min + " мінімальний елемент масиву" );
			 }
			


	}


