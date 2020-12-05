package lesson26;

public class Zad3 {

	public static void main(String[] args) {
		int a[] = new int[]{1, 5, -1, 2, 4, 123, 7, 6, 9, -999 };
		 int max=0;
		 int min =0;
		 int imax = 0;
		 int imin = 0;
		 for(int i=0; i<a.length; i++)
		    System.out.print(a[i]+" ");
		    System.out.println();
		 for(int i=0; i<a.length; i++){
		  if(a[i]>max){
		   max=a[i];
		   imax=i;
		  }
		  if(a[i]<min){
		   min=a[i];
		   imin = i;
		  }
		        }
		 a[imin] =max; a[imax] = min;
		 for(int i=0; i<a.length; i++)
		  System.out.print(a[i]+" ");
		  System.out.println();
		  

	}

}
