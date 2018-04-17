import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	
	 private  LinkedBlockingQueue<Runnable> queue;
	
	  private final int nThreads;
	
	  private  final PoolWorker[] threads;

	
	public ThreadPool(int nThreads) {
		
		        this.nThreads = nThreads;
		
		        queue = new LinkedBlockingQueue();
		
		        threads = new PoolWorker[nThreads];
		
		        for (int i = 0; i < nThreads; i++) {
		
		            threads[i] = new PoolWorker(queue);
		
		            threads[i].start();
		
		        }
		
		    }

	
	public void execute(Runnable task) {

		synchronized (queue) {

			queue.add(task);

			queue.notifyAll();
		}

	}

	
}
