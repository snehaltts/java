import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws ParseException {
		int n;
		System.out.println("Enter the number of players: ");
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
        Player [] pl = new Player[n];
        for(int i=0;i<n;i++) {
	    String s;
	    Scanner in2=new Scanner(System.in);
	    s=in2.nextLine();
	    pl[i]=Player. createPlayer(s);
        }
   HashMap<String, Integer> hs = new HashMap<String, Integer>(); 

      for (int i = 0; i < n; i++) { 
    if (hs.containsKey(pl[i].nationality)) { 
     hs.put(pl[i].nationality, hs.get(pl[i].nationality) + 1); 
    } 
   else { 
     hs.put(pl[i].nationality, 1); 
    }
   Set<Map.Entry<String, Integer> > set = hs.entrySet(); 
   String key = ""; 
   int value = 0; 

   for (Map.Entry<String, Integer> me : set) { 
     if (me.getValue() > value) { 
         value = me.getValue(); 
         key = me.getKey(); 
     } 
 } 
        System.out.println("The nationality with maximum players: "+key);
        System.exit(0);

} 
} 

	}