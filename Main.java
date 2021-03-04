import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Object.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Wicket> w = new ArrayList<Wicket>();
		Scanner sc = new Scanner(System.in);
		HashMap<Bowler,Wicket> hm = new HashMap<Bowler,Wicket>();
		
		boolean b = true;
		
		boolean c = true;
		String result = Boolean.toString(c);
		
		
		boolean d = true;
		String result1 =Boolean.toString(d);
		
			System.out.println("Enter the player name ");
			String bname = sc.nextLine();
			
			
			Bowler b1 = new Bowler(bname);
		
			hm.put(b1,null);
		
			System.out.println("Enter wickets - seperated by | symbol. ");
			hm.put(b1, new Wicket(sc.nextLine(), b1));
		
			System.out.println("Do you want to add another player(YES/NO)");
			result = sc.next();
			if(result.equalsIgnoreCase("yes"))
			 {
				 c=true;
			 }
			 else
			 {
				 c=false;
			 }
			
			 while(c==true)
			 {
				
				 System.out.println("Enter the player name ");
				 bname = sc.nextLine();
				 sc.nextLine();
				
				 b1 = new Bowler(bname);
	
				 hm.put(b1,null);
	
				 System.out.println("Enter wickets - seperated by | symbol. ");
				 hm.put(b1, new Wicket(sc.nextLine(), b1));
	
				 System.out.println("Do you want to add another player(YES/NO)");
				 result = sc.nextLine();
				 if(result.equalsIgnoreCase("yes"))
				 {
					 c=true;
				 }
				 else
				 {
					 c=false;
				 }
						
			}

		Wicket w1 = hm.get(b1);
		
		String bow=b1.getName(); 
		
		String w2= w1.getPlayerName();
		
		
		String [] wrr = w2.split("\\|");

		System.out.println("Enter the player name to search ");
		
		String ser = sc.next();
		
		if(ser.equals(bow))
		{
			for(String e:wrr)
			{
				System.out.println(e);	
				
			}
		}
			else
			{
				System.out.println("No Player found with the name "+ ser);
			
			}
	}
}