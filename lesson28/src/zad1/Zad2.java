package zad1;

public class Zad2 {

	public static void main(String[] args) {
		 int[] a = {1,2,3};
		 int[] b = {4,5,6,7,8,9,10};
		 int[] ab = new int[a.length+b.length];
		 for (int i=0;i<ab.length;i++){
		  if(i<a.length){
		   ab[i]=a[i];
		  }else{
		   ab[i]=b[i-a.length];
		  }
		 }
		 for (int temp:ab){
		  System.out.print(temp+" ");
		 }
	}

}
