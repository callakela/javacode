
public class FibonacciSeries {
	
	 public static int fibRecursive(int number) {
	 
		 int resltNumber=0;
		 
		 if(number==0 || number==1) {
			 return number;
		 }
		 
		 resltNumber=fibRecursive(number-1)+fibRecursive(number-2);
		// System.out.println(resltNumber);
		 return resltNumber;
	 }
	 
	 public static void main(String... args) {
		 
		 for (int number = 0; number <= 10; number++) {
				System.out.printf("%d ", fibRecursive(number));
			}
		 
		 
	 }

}
