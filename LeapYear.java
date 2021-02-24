import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args)
   {
      int year;
     
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();
      int k=check_Leap_Year(year);
	if(k==-1)
	{
		System.out.println("Invalid Input");
	}
	else if(k==1)
	{
		System.out.println("Yes");	
	}
	else 
	{
		System.out.println("No");	
	}
   }
      static int  check_Leap_Year(int year)
      {
     int a=0;
      if(year>0)
      {
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         a=1;
      else
         a=0;
       }
      else {
	 a=-1;
	}
	return a;
       }
	
}