package lesson32;

public class Zad1 {

	public static void main(String[] args) {
		int a [] = new int[] {0, 8, -1, 2, 3, 22, 7, -6, 9,4, -12 };
		int sum = 0;
		for(int i=0; i<a.length; i++)
			sum=sum+a[i];	  
		double arifm1 = sum;
		arifm1 = arifm1/a.length;
		int b [] = new int[] {0, 8, -1, 2, 23, 32, 7, -6, 9,5, -12 };
		int sum2 = 0;
		for(int i=0; i<b.length; i++)
			sum2=sum2+b[i];	  
		double arifm2 = sum2;
		arifm2 = arifm2/b.length;
		 int[] ab = new int[a.length+b.length];
		 for (int i=0;i<ab.length;i++){
		  if(i<a.length){
		   ab[i]=a[i];
		  }else{
		   ab[i]=b[i-a.length];
		  }
		 }
		 int max=0;
		 int min=0;
		 if (arifm1>arifm2) {
			 max=(int)arifm1;
			 min=(int)arifm2;
		 }else {
			 max=(int)arifm2;
			 min=(int)arifm1;
		 }
		 int count=0;
		 for (int i=0;i<ab.length;i++){
			 if(ab[i]>=min & ab[i]<=max) {
			 count++;
			 }
		 }
		 int[] y = new int[count];
		 int j=0;
		 for (int i=0;i<ab.length;i++){
			 if(ab[i]>=min & ab[i]<=max) {;
			 y[j++]=ab[i];
			 }
		 }
		 for(int temp:y){
			  System.out.print(temp+" ");
			  }
		 	}
}
