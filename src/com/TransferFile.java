import java.io.File;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TransferFile {
	
	Lock lock = new ReentrantLock();
	
	
	public void transferFile(File file){
		
		lock.lock();
		
		try {
			
			System.out.printf("Sending file to another machine,time required: %d\n", new Random().nextInt(200));
            //transferring file to another server machine
            //sleep(new Random().nextInt(200));
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			lock.unlock();
		}
		
		
	}

}
