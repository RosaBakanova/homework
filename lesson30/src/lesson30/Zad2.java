package lesson30;

public class Zad2 {

	public static void main(String[] args) {
		  int [] x={2,-4,-3,1,2,5,-6};
		  int count=0;
		  int k=0;
		  int b=0;
		  for(int temp:x){
		   if(temp<0){
		    count++;
		   }
		 }
		  int[] y = new int[count];
		  int[] z = new int[x.length-count];
		  for (int temp:x){
		   if(temp>0){
		    z[k++]=temp;
		   }else{
		    y[b++]=temp;
		   }
		  }
		  for(int masiv1:z){
		  System.out.print(masiv1+" ");
		  }
		  System.out.println();
		  for(int masiv2:y){
		  System.out.print(masiv2+" ");
		  }


}
}
