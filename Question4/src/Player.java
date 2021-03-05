import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Player implements Comparable<Player>{
	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	
	private int noOfMatch;
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
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getNoOfMatch() {
		return noOfMatch;
	}
	public void setNoOfMatch(int noOfMatch) {
		this.noOfMatch = noOfMatch;
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
	public Player(String name, LocalDate dateOfBirth,String skill,  int noOfMatch, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.skill = skill;
		this.dateOfBirth = dateOfBirth;
		this.noOfMatch = noOfMatch;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	
	public static Player createPlayer(String detail) throws ParseException {
		
		String[] st = detail.split(",");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(st[1], formatter);
		double r = Double.parseDouble(st[7]);
		int v1 = Integer.parseInt(st[3]);
		int v2 = Integer.parseInt(st[4]);
		int v3 = Integer.parseInt(st[5]);
		Player P = new Player(st[0],date, st[2], v1,v2,v3, st[6], r);
		return P;

	}
	
	public int compareTo(Player arg) {
		return 0;
	}
	
}