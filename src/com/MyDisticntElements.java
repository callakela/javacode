
public class MyDisticntElements {
	
	public void getDistinct(int[] arrays){
		
		//boolean isDistinct=false;
		 
		
		for (int i = 0; i < arrays.length; i++) {
			
			int printVal = arrays[i];
			
			  for (int j = i+1; j < arrays.length; j++) {
				  
				 if(printVal == arrays[j]  ) {
					break; 
				 }else {
					 System.out.println(arrays[i]);
					 break;
				 }
				
			  }
			
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		int[] array={1,2,2,3,5,6,7,5,8};
		
		new MyDisticntElements().getDistinct(array);;
		
		
	}

}
