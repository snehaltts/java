import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Tariff Calculator");
		System.out.println("1. Deluxe Room \n"+ "2. Deluxe AC Room\n"+ "3. Suite AC Room\n"+ "");
		System.out.println("Select Room Type:");
		
		int roomTp = Integer.parseInt(br.readLine());
		System.out.println("Hotel name:");
		
		String hotelName= br.readLine();
		System.out.println("Room Square Feet Area:");
		
		int sqFt = Integer.parseInt(br.readLine());
		System.out.println("Room has TV (yes/no):");
		
		String tW = br.readLine();
		boolean tWVal = true;
		if(tW.equalsIgnoreCase("Yes"))
		{
			tWVal = true;
		}
		else
		{
			tWVal = false;
		}
		System.out.println("Room has WIFI (yes/no):");
		String wW = br.readLine();
		boolean wValue = true;
		if(wW.equalsIgnoreCase("Yes"))
		{
			wValue = true;
		}
		else
		{
			wValue = false;
		}
		if(roomTp==1)
		{
			DeluxeRoom dlR=new DeluxeRoom(hotelName, sqFt, tWVal, wValue);
		}
		else if(roomTp==2)
		{
			DeluxeACRoom dlAcR=new DeluxeACRoom(hotelName, sqFt, tWVal, wValue);
		}
		else if(roomTp==3)
		{
			SuiteACRoom sAcR=new SuiteACRoom(hotelName, sqFt, tWVal, wValue);
		}
	}
}

