import java.util.Scanner;
public class ArithmeticOperation
{
	public static void main(String [] args)	
{
	int p,q,r;
	Scanner sc= new Scanner(System.in);
	p=sc.nextInt();
	q=sc.nextInt();
	r=sc.nextInt();
	int k=Arithmetic_Operation(p,q,r);
	if(k==-1)
	{
	System.out.println("Invalid Input");
	}
	else
	{
		System.out.println(k);
	}
}
	static int Arithmetic_Operation(int p,int q,int r)
	{
	int a=0; 
	if((p>=32767 || p<0) || (q>=32767 || q<0) || (r>4 || r<0))
	{
		a=-1;
	}
	else
	{
		switch(r)
		{
		case 1:
			a=p+q;
			
			break;
		case 2:
			a=p-q;
			
			break;
		case 3:
			a=p*q;
			
			break;
		case 4:
			a=p/q;
			break;
		}
		
	}
	return a;
	}
}