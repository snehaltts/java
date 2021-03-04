import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import java.util.*;
public class Player {

	private String name;
	private Date dateOfbirth = new Date();
	private String skill;
	private int NumberOfmatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double PowerRating;
	
	
	public Player(String name, Date dateOfbirth, String skill, int numberOfmatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfbirth = dateOfbirth;
		this.skill = skill;
		NumberOfmatches = numberOfmatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		PowerRating = powerRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofbirth() {
		return dateOfbirth;
	}
	public void setDateofbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberofmatches() {
		return NumberOfmatches;
	}
	public void setNumberofmatches(int numberOfmatches) {
		NumberOfmatches = numberOfmatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return PowerRating;
	}
	public void setPowerRating(double powerRating) {
		PowerRating = powerRating;
	}
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter player 1  details: ");
		String input= sc.next();
		System.out.println("Enter player 2 details: ");
		String in = sc.next();
		String arr[] = input.split(",");
		String array[] = in.split(",");
		try
		{
		SimpleDateFormat formatter1=new SimpleDateFormat("dd-MM-yyyy");
		Date date1=formatter1.parse(arr[1]);
		SimpleDateFormat formatter2=new SimpleDateFormat("dd-MM-yyyy");
		Date date2=formatter2.parse(array[1]);
		
		Player obj = new Player(arr[0],date1,arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],Double.parseDouble(arr[7]));
		Player obj1 = new Player(array[0],date2,array[2],Integer.parseInt(array[3]),Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6],Double.parseDouble(array[7]));
		System.out.println("Player Details: ");
		System.out.println("Name: "+obj.name);
		System.out.println("Date-of-Birth: "+obj.dateOfbirth);
		System.out.println("Skill: "+obj.skill);
		System.out.println("Number of Matches: "+obj.NumberOfmatches);
		System.out.println("Runs: "+obj.runs);
		System.out.println("Wickets: "+obj.wickets);
		System.out.println("Nationality: "+obj.nationality);
		System.out.println("Power rating: "+obj.PowerRating);
		System.out.println();
		System.out.println("Player2 Details: ");
		System.out.println("Name: "+obj1.name);
		System.out.println("Date-of-Birth: "+obj1.dateOfbirth);
		System.out.println("Skill: "+obj1.skill);
		System.out.println("Number of Matches: "+obj1.NumberOfmatches);
		System.out.println("Runs: "+obj1.runs);
		System.out.println("Wickets: "+obj1.wickets);
		System.out.println("Nationality: "+obj1.nationality);
		System.out.println("Power rating: "+obj1.PowerRating);
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i].equals(arr[i]))
			{
				continue;
			}
			else
			{
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("Player 1 is same as Player 2");
		}
		else
		{
			System.out.println("Player 1 and Player 2 are different ");
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}