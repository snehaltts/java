import java.util.*;
public class MatchMain {
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the match format\r\n"
				+ "\r\n"
				+ "1. ODI\r\n"
				+ "\r\n"
				+ "2. T20\r\n"
				+ "\r\n"
				+ "3. Test");
		int CurrentScore=sc.nextInt();
		System.out.println("Enter the Current score");
		int x=sc.nextInt();
		System.out.println("Enter the Current Over");
		int y=sc.nextInt();
		System.out.println("Enter the Target Score");
		int z=sc.nextInt();
		if(CurrentScore==1)
		{
			ODIMatch od=new ODIMatch();
			float a=od.CalculateRunRate(x,y,z);
			int b=od.CalculateBalls(x,y,z);
			od.display(a,b);
		}
		else if(CurrentScore==2)
		{
			T20Match t20=new T20Match();
			float a=t20.calculateRunRate(x,y,z);
			int b=t20.calculateBalls(x,y,z);
			t20.display(a,b);
		}
		else if(CurrentScore==3)
		{
			TestMatch tt=new TestMatch();
			float a=tt.CalculateRunRate(x,y,z);
			int b=tt.CalculateBalls(x,y,z);
			tt.display(a,b);
		}
	}

}
