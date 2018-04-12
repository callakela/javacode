import java.util.ArrayList;

public class DecimalToBinary {
	
	public static void printBinaryFormat(int num) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(num>0) {
			
			list.add(num%2);
			num=num/2;
		}
		
		list.forEach(e->System.out.print(e));
		
		
	}
	
	public static void main(String... str) {
		printBinaryFormat(20);
		
	}

}
