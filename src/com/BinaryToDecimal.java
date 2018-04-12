public class BinaryToDecimal {
	
	
	public static int getDecimalFromBinary(int num) {
		
		int reslt=0;
		int power=0;
		
		while(true) {
			
			if(num ==0 ) {
				
				break;
				
			}else {
				int temp=num%10;
				reslt +=temp*Math.pow(2, power++);
				num=num/10;
				
				
			}
		}	
		
		return reslt;
	}
	
	public static void  mergeString(int[] arr) {
		int duplicate = 0;
		boolean flag = false;
		 for(int i = 0; i < arr.length; i++){
			 
	            for(int j= i+1; j < arr.length;j++){
	            	
	                if(arr[i] == arr[j]){
	                	if(!flag) {
	                		arr[j] = arr[j]+1;
	                		flag = true;
	                	}else {
	                		arr[j-1] = arr[j]+1;
	                	}
	                	
	                	
	                }else {
	                	flag = false;
	                }
	            }
	        }
		 
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr=  {1,2,2,3,3};
		mergeString(arr);
		//mergeString("Code to write great Time");
		//System.out.println(str);
		
		
	}

}
