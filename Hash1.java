import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Hash1 {

	public static void main(String[] args) throws Exception {
   
		HashSet<String> h = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String n1= br.readLine();
		String n2= br.readLine();
		String n3= br.readLine();
		String n4= br.readLine();
		String n5= br.readLine();
		
		h.add(n1);
		h.add(n2);
		h.add(n3);
		h.add(n4);
		h.add(n5);
		
		System.out.println(h.size());
	}

}