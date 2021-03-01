import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List {

	public static void main(String[] args) throws IOException {
				
				 ArrayList a =new ArrayList(); 
				 BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
				 System.out.println("Enter the Player's details: ");
				 System.out.println("Enter Player name: ");
				 String Name = (b.readLine());
				 a.add(Name);
				 System.out.println("Enter Age: ");
				 int Age = Integer.parseInt(b.readLine());
				 a.add(Age);
				 System.out.println("Enter Country: ");
				 String Country = (b.readLine());
				 a.add(Country);
				 System.out.println("Player's details: ");
				 for (Object Player: a){
				      System.out.println(Player);
				    }
				 
				 System.out.println("Enter skill: ");
				 String skill = (b.readLine());
				 a.add(skill);
				 System.out.println("Enter the position to add the skill: ");
				 int Post = Integer.parseInt(b.readLine());
				 a.remove(Post);
				 a.remove(Country);
				 System.out.println("Player's details: ");
				 for (Object Player: a){
				      System.out.println(Player);
				 }
						 
			}
			
		}
		




