import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MatchSortMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Match> date=new ArrayList<Match>();
		System.out.println("Enter the number of matches");
		int n=sc.nextInt();
		
        for(int i=0;i<n;i++) 
        	
        {			
			System.out.println("Enter match Date in (MM-dd-YYYY): ");
			String s= sc.nextLine();
			System.out.println("Enter Team 1: ");
			String s1 = sc.nextLine();
			System.out.println("Enter team 2: ");
			String s2 = sc.nextLine();
			date.add(new Match(s,s1,s2) );
		}
		System.out.println("Match Details: ");
		Collections.sort(date,Collections.reverseOrder());
		for(Match d:date){  
			
			System.out.println("Team 1 " +d.getTeamOne()); 
			System.out.println("Team 2 "+d.getTeamTwo());  
			System.out.println("Match held on "+d.getMatchDate());			
			
		}  
	
	}

}
