
public class DeluxeRoom extends HotelRoom{
	
	protected int ratePerSqFeet;
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		
		ratePerSqFeet=10;
		if(hasWifi==true)
		{
			ratePerSqFeet();
		}
		int sum=calculateTariff();
		System.out.println("Room Traiff is: "+ sum);
	}
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int ratePerSqFeet()
	{
		ratePerSqFeet=ratePerSqFeet+2;
		return ratePerSqFeet;
	}
	
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;
	}
	
	
}
