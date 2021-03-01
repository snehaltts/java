
public class HotelRoom {
	
	protected String hotelName;
	protected int numberOfSqFeet;
	private boolean hasTV, hasWifi;
	public HotelRoom() {
		super();
	}
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff() {
		return 0;
	}
	
}
