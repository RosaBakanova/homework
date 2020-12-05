package lesson20;

public class Zad7 {

	public static void main(String[] args) {
			int m;
					for (int n=0; n<=100; n++) { 
						m=n/2;
						int f=0;
						if( n==0 || n==1){  
						}else{
							for(int i=2; i<=m; i++){    
								if(n%i==0){    
									f=1;    
									break;    
								}    
							}    
							if(f==0)  { System.out.println(n); }
						}
					}		
			}  
}


