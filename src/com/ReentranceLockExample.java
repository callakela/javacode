
public class ReentranceLockExample {

	public static void main(String...args ) {
		
		 for(int job = 0 ; job < 5; job++) {
	            FileTransferJob transferJob = new FileTransferJob(new TransferFile());
	            Thread th= new Thread(transferJob);
	            th.start();
	        }
		
	}
}
