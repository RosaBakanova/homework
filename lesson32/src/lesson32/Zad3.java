package lesson32;

public class Zad3 {

	public static void main(String[] args) {
		  int [][] x={{1,23,3}, {564,5,6}, {7,58,9}};
		  int [][] y= new int[x.length][x.length];
		 
		  for(int j=0; j<x.length; j++) {
			  int sum=0;
			for(int i=0; i<x.length; i++) {
				sum=sum+x[j][i];	}  
			double arifm1 = sum;
			arifm1 = arifm1/x.length;
			for(int i=0; i<x.length; i++) {
				y[j][i]=x[j][i]-(int)arifm1;
			}
		  }
		  for (int i = 0; i < x.length; i++) { 
		      for (int j = 0; j < x[i].length; j++) 
		      { System.out.print(y[i][j]+" ");
		            } 
		      System.out.println();

	}
	}
}
