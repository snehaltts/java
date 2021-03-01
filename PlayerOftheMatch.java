import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class PlayerOftheMatch {

	public static void main(String[] args) throws Exception {
		
		TreeSet ts = new TreeSet();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String n1= br.readLine();
		String n2= br.readLine();
		String n3= br.readLine();
		String n4= br.readLine();
		String n5= br.readLine();
		
		ts.add(n1);
		ts.add(n2);
		ts.add(n3);
		ts.add(n4);
		ts.add(n5);
		
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		
	}

}
