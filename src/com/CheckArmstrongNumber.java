
public class CheckArmstrongNumber {
	
	static boolean checkArmstrongNumber(int number) {
		
		int copyOfDigit= number;
		
		int sum=0;
		
		int noOfDigit=String.valueOf(number).length();
		
		
		while(copyOfDigit!=0) {
			
			int lastDigit=copyOfDigit%10;
			
			sum +=Math.pow(lastDigit, noOfDigit);
			
			copyOfDigit=copyOfDigit/10;
			
		  }
		
		if(number==sum) {
			return true;
		}
		 return false;
	}
	
	public static void main(String[] args) {
		System.out.println("is Armstrong  ::"+checkArmstrongNumber(407));
	}
}
