package lesson22;

public class Zad5 {

	public static void main(String[] args) {
		int m;
		int n=0;
		while (n<=100) { 
			m=n/2;
			
			int f=0;
			if( n==0 || n==1){
			}else{
				int i=2;
				while(i<=m){
					
					if(n%i==0){    
						f=1;
						
						break;    
					} i++;   
				}    
				if(f==0)  { System.out.println(n); }
			}
			n++;
		}		


	}

}
