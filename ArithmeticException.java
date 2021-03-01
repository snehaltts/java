import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticException{

	public static void main(String args[]) throws NumberFormatException, IOException {
		try {
		BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total runs scored: ");
		int runs = Integer.parseInt(b.readLine());
		System.out.println("Enter the total overs faced");
		Double overs = Double.parseDouble(b.readLine());
		double runRate = runs / overs;
		System.out.println("Current Run Rate: "+runRate);
		} catch (NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		
	}
}