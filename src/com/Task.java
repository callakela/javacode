
public class Task implements Runnable{
	
	private int num;
	
    public Task(int n) {
	        num = n;
	    }


	@Override
	public void run() {
		
		System.out.println("Task " + num + " is running. and thread Id is:"+Thread.currentThread().getId());

		
	}

}