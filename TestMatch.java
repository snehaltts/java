
public class TestMatch extends Match{
	
	public float CalculateRunRate(int x,int y, int z) {
		int a=z-x;
		int b=90-y;
		float c=a/b;
		return c;
	}

	public int CalculateBalls(int x,int y, int z) {
		int d=540-(y*6);
		return d;
	}
	
	public void display(float reqRunrate, int balls) {
		System.out.println("Need" +(reqRunrate*(balls/6))+ "runs in" +balls+ "balls");
		System.out.println("Required Runrate:"+reqRunrate);
		
		
		
	}
}
