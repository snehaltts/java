import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TeamSwap {

	public static void main(String[] args) throws IOException {
		
		 ArrayList<String> al =new ArrayList<String>(); 
		 BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		 al.add("Sunrisers Hyderabad");
		 al.add("Delhi Challengers Banglore");
		 al.add("Royal Challengers Banglore");
		 al.add("Kolkata Knight Riders");
		 al.add("Mumbai Indians");
	
		 System.out.println(al);
		 
		 System.out.println("Enter swap positions1");
		 int position1=Integer.parseInt(b.readLine());
		 System.out.println("Enter swap positions2");
		 int position2=Integer.parseInt(b.readLine());
		 
		 Collections.swap(al, position1,position2);
			for(String s : al) {
				System.out.println(s);
			}
	}

}
