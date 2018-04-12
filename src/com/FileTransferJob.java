import java.io.File;

public class FileTransferJob implements Runnable {

	private TransferFile transferFile;

    public FileTransferJob(TransferFile transferFile) {
        this.transferFile = transferFile;
    }

	@Override
	public void run() {
		
		try {
			System.out.printf("%s, Start sending dummy file to another machine\n");
			transferFile.transferFile(new File(""));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
