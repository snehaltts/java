public class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;

	public TwoWheeler(String vehicleNumber, String make, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(vehicleNumber, make, fuelType, fuelCapacity, cc);
		kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		kickStartAvailable = kickStartAvailable;
	}

	
    public void displayDetailInfo() {
		
    	if(kickStartAvailable==true) {
    		System.out.println("KickStartAvailable:Yes");
    	}
    	else {
    		System.out.println("KickStartAvailable:No");
    	}
	}
}
