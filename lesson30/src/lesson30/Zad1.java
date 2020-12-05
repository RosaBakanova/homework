package lesson30;

public class Zad1 {

	public static void main(String[] args) {
		  int [] x={0, 8, -1, 2, 3, 22, 7, -6, 9, -12};
		  int max=(int)Double.NEGATIVE_INFINITY;
		  int min=(int)Double.POSITIVE_INFINITY;


		  for (int i=0;i<x.length;i++){
		   if (x[i]>max){
		    max=x[i];
		  }
		   if(x[i]<min){
		    min=x[i];
		   }
		  }
		  int count=0;
		  for (int temp:x){
		   if(temp==max||temp==min){
		    count++;
		   }
		  }
		  int[]res=new int[x.length-count];
		  int j=0;
		  for(int i=0;i<x.length;i++){
		   if (x[i]!=min&&x[i]!=max){
		    res[j++]=x[i];
		   }
		  }
		  for(int temp:res){
		  System.out.print(temp+" ");
		  }
		 }
}
