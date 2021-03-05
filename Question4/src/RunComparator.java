import java.util.Comparator;

public class RunComparator implements Comparator <Player>{

	public int compare(Player arg, Player arg1) {
			if(arg.getRuns()==arg1.getRuns())  
				return 0;  
			
				else if(arg.getRuns() > arg1.getRuns())  
				return 1;  
				
				else  
				return -1; 
		}
}