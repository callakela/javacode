
public class SumPrimeNum {
	
	int getSumofPrimeNumb(int upperLimt) {
		
		int count=0;
		int sum=0;
		int number=2;
		 while(count<=upperLimt) {
			 
		  if(isNumberPrime(number)) {
			  
			  sum +=number;
			  count++;
			 }
		  number++;
		 }
		return sum;
	}
	
	boolean isNumberPrime(int num) {
		
		boolean isPrime=true;
		
		for (int i = 2; i <= num/2; i++) {
			
			if(num%i==0) {
				
				isPrime=false;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args)
	{
		int sum =new SumPrimeNum().getSumofPrimeNumb(10);
		
		System.out.println("sum ="+sum);
	}


}
