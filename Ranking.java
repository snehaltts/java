
public class Ranking implements Comparable<Ranking>{
	
	private String name;
	private int score;
	
	Ranking(String name,int score){
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int compareTo(Ranking rk) {
		if(score==rk.score)  
			return 0;  
		else if(score<rk.score)  
			return 1;  
		else  
			return -1; 
	}
}
