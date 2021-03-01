import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RankingMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Ranking> al=new ArrayList<Ranking>();
		System.out.println("Please provide the number of players");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the player"+(i+1));
			String S=sc.next();
			System.out.println("Enter the score of the player"+(i+1));
			int x=sc.nextInt();
			al.add(new Ranking(S,x));
		}
		System.out.println("Player details by score(High to Low): ");
		Collections.sort(al);
		for(Ranking rk:al){  
			
			System.out.println(rk.getName()+" "+rk.getScore());  
			}  
		

	}

}