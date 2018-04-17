
public class MyBubbleSort {
	
	
	public static void sortUsingBubble(int [] array) {
		
		int k;
		for (int i =array.length-1; i>0 ; i--) {
			
			for (int j = 0; j < array.length-1; j++) {
				k=j+1;
				if(array[j]>array[k]) {
					swapNumbers(j,k,array);
				}
			}
		}
		
		System.out.print(array.toString());
		
	}
	
	public static void swapNumbers(int i,int j,int[] arra) {
		
		int temp=arra[i];
		arra[i]=arra[j];
		arra[j]=temp;
	}
	
	public static void main(String... args) {
		
		 int[] array={1,5,6,3,4,9};
		 
		 sortUsingBubble(array);
		 
	 }

}
