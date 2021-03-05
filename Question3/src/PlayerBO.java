import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;

public class PlayerBO 
{
	String a,b;
	List<Player> p1=new ArrayList<Player>();
	public void findPlayer(List<Player> p1,String nationality) {
		for(Player e:p1) {
			if(e.getNationality().equals(e)) {
				a=e.getName();
				System.out.println(a);
			}
		}
	}
	public void findPlayer(List<Player>p1,Date dateOfBirth) {
		for(Player e1:p1) {
			if(e1.getDate1().equals(e1)) {
				b=e1.getName();
				System.out.println(e1);
			}
		}
	}
}
