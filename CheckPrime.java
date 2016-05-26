import java.io.*;

public class CheckPrime {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		int num = Integer.parseInt(br.readLine());
		CheckPrime cp = new CheckPrime();
		
		if(cp.checkPrime(num)){
		
			System.out.println(num + " is not a prime number.");
				
		}
		else{
			
			System.out.println(num + " is a prime number.");
			
		}
			
		

	}
	
	public boolean checkPrime(int num){
		
		if(num==1){
			
			return true;
				
		}
		else{
			
			for(int i=2; i<num/2; i++){
				
				if(num%i==0){
					
					return true;
				}
				
			}	
			return false;
		}
		

	}
	
}
