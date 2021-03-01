
public class FourWheeler extends Vehicle{
	
	protected String audioSystem;
	protected int numberOfDoor;
	
	public FourWheeler() {
		super();
	}
	
	public FourWheeler(String audioSystem, int numberOfDoor) {
		super();
		this.audioSystem = audioSystem;
		this.numberOfDoor = numberOfDoor;
	}


	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
	}
	
	public String getAudioSystem() {
		return audioSystem;
	}
	
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	
	public int getNumberOfDoor() {
		return numberOfDoor;
	}
	
	public void setNumberOfDoor(int numberOfDoor) {
		this.numberOfDoor = numberOfDoor;
	}
	
	public void display() {
		System.out.println("---Basic Information---");
		System.out.println("Audio System:"+getAudioSystem());
		System.out.println("Number of Doors:"+getNumberOfDoor());
		
	}
}
