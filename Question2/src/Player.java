 import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;

public class Player {
	
	private String name;
	private Date dateOfbirth = new Date();
	private String skill;
	private int numberOfMatch;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatch() {
		return numberOfMatch;
	}
	public void setNumberOfMatch(int numberOfMatch) {
		this.numberOfMatch = numberOfMatch;
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
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	public Player(String name, Date dateOfbirth, String skill, int numberOfMatch, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfbirth = dateOfbirth;
		this.skill = skill;
		this.numberOfMatch = numberOfMatch;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}	
	
}
