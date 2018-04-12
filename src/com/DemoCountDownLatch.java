
public class DemoCountDownLatch {
	
	 private static int numberOfPassenger = 7;
	    public static void main(String[] args) {

	        //Book a cab - 7 Seater
	        ShareCab tripCab = new ShareCab(numberOfPassenger);

	        Thread cabThread = new Thread(tripCab);
	        cabThread.start();

	        //create passenger
	        for(int nPass = 1 ; nPass <= numberOfPassenger; nPass++) {
	            Passenger passenger = new Passenger(tripCab,"Passenger "+nPass);
	            Thread passengerThread = new Thread(passenger);
	            passengerThread.start();
	        }
	    }

}
