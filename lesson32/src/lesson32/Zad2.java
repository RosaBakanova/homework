package lesson32;

public class Zad2 {

	public static void main(String[] args) {
		  int [][] x={{1,2,3}, {4,5,6}, {7,8,9}};
		  int [][] y= new int[x.length][x.length];
		  int [][] z= new int[x.length][x.length];
		  for (int i = 0; i < x.length; i++) { 
		      for (int j = 0; j < x[i].length; j++) 
		      {if (j == 0) {y[i][j]=x[i][x[i].length-1];}else{
		    	  y[i][j]=x[i][j-1]; 
		      		      }
		  }
		  }
		  for (int i = 0; i < y.length; i++) { 
		      for (int j = 0; j < y[i].length; j++) 
		      {if (j == 0) {z[j][i]=y[y.length-1][i];}else{
		    	  z[j][i]=y[j-1][i]; 
		      		      }
		  }
		  }
		  for (int i = 0; i < z.length; i++) { 
	      for (int j = 0; j < z[i].length; j++) 
	      { System.out.print(z[i][j]);
	            } 
	      System.out.println();
}
}
}
