
public class MyBinaryCheck {
	
	public static boolean isNumberBinary(int num) {
		
		boolean isNumBinary=true;
		
		if(num==0 || num==1) {
			 return isNumBinary;
		}else {
			
			while(num>=0) {
				int res=num%10;
				if(res>1) {
					isNumBinary=false;
					break;
				}
				num = num/10;
			}
		}
		
		return isNumBinary;
		
	}

	public static void main(String... str) {
		
		
		System.out.println(isNumberBinary(101));
		
	}
}
