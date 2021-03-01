
public class T20Match extends Match{
	
	public float calculateRunRate(int x,int y, int z) {
		int a=z-x;
		int b=20-y;
		float c=a/b;
		return c;
	}

	public int calculateBalls(int x,int y, int z) {
		int d=120-(y*6);
		return d;
	}
	
	public void display(float reqRunrate, int balls) {
		System.out.println("Need" +(reqRunrate*(balls/6))+ "runs in" +balls+ "balls");
		System.out.println("Required Runrate:"+reqRunrate);
		
		
	}

}
