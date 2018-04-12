import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunnable implements Runnable {
	
	CyclicBarrier  cyclicBarrier1;
	CyclicBarrier  cyclicBarrier2;
	
	CyclicBarrierRunnable(CyclicBarrier  cyclicBarrier1,CyclicBarrier  cyclicBarrier2){
		
		this.cyclicBarrier1=cyclicBarrier1;
		this.cyclicBarrier2=cyclicBarrier2;
	}
	
	
	@Override
	public void run() {
		
		try {
			
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 1");
            this.cyclicBarrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 2");
            this.cyclicBarrier2.await();

            System.out.println(Thread.currentThread().getName() +
                                " done!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
		
	}
	

}
