
public class TaskEvenOdd implements Runnable{
	
	Print print;
	int num;
	
	int limit;
	
	TaskEvenOdd(Print print, int num){
		this.print=print;
		this.num=num;
		limit=num;
	}

	@Override
	public void run() {
		
		while(num<limit) {
			
			 if(num%2 == 0){
	                System.out.println("Number is :"+ num);
	                print.printEven(num);
	                num+=2;
	            }
	            else {
	                System.out.println("Number is :"+ num);
	                print.printOdd(num);
	                num+=2;
	            }
		}
		
		
		
	}
	
	
	public static void main(String...strings ) {
		Print prt= new Print(false);
		Thread t1= new Thread(new TaskEvenOdd(prt,10));
		Thread t2= new Thread(new TaskEvenOdd(prt,10));
	}

	
}
