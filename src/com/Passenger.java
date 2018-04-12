public class Passenger implements Runnable {
	
	private ShareCab shareCab;
    private String passengerName;

    public Passenger(ShareCab shareCab, String passengerName) {
        this.shareCab = shareCab;
        this.passengerName = passengerName;
    }
	
	

	@Override
	public void run() {
		
		int arrivalTime = (int) (Math.random() * 2000);
        try {
            Thread.sleep(arrivalTime);
            shareCab.board(passengerName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		
	}

}
