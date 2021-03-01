import java.io.*;
public class ShapeMain {
public static void main(String args[])throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Circle sobj=new Circle();
	Square sobj1=new Square();
	System.out.println("Circle");
	System.out.println("Square");
	System.out.println("Enter the shape");
	String s1=br.readLine();
	if(s1.equalsIgnoreCase("Circle"))
	{
		System.out.println("Enter the radius");
		int a=Integer.parseInt(br.readLine());
		sobj.CalculateArea(a);	
	}
	else
	{
		System.out.println("Enter the side");
		int b=Integer.parseInt(br.readLine());
		sobj1.CalculateArea(b);
	}
}
}
