
public class Match implements Comparable<Match>{
	
	private String matchDate,teamOne,TeamTwo;

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return TeamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		TeamTwo = teamTwo;
	}

	public Match(String matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		TeamTwo = teamTwo;
	}
	public int compareTo(Match m) {
		if(getMatchDate()==null||m.getMatchDate()==null)
			return 0;
		return getMatchDate().compareTo(m.getMatchDate());
	}
}
