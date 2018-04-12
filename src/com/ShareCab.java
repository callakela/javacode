import java.util.concurrent.CountDownLatch;

public class ShareCab implements Runnable{
	
	private CountDownLatch countDownLatch;
	
	public  ShareCab(int numberOfPassanger) {
		
		countDownLatch=new CountDownLatch(numberOfPassanger);
	}
	
	public void board(String passengerName) {
        System.out.printf("\n%s has boarded the cab",passengerName);
        countDownLatch.countDown();
    }

	@Override
	public void run() {
		System.out.printf("\nNumber of friends planned for trip: %d", countDownLatch.getCount());
			try {
			//waiting for all threads.
			countDownLatch.await();
			System.out.printf("\nAll friends has boarded the cab. Let's start the journey");
			} catch (InterruptedException e) {
			System.out.println("Interruption exception has occurred");
			}
		
	}
	
	

}
