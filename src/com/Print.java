
public class Print {
	
	boolean isOdd;
	
	Print(boolean isOdd){
        this.isOdd = isOdd;
    }
	
	synchronized void printEven(int num) {
		
	 try {
		 wait();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    System.out.println("Even:"+num);
    isOdd = true;
    notifyAll();
			
	}
	
	synchronized void printOdd(int num) {
		
		try {
			 wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
	    System.out.println("Even:"+num);
	    isOdd = false;
	    notifyAll();
				
		}

}
