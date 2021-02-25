import java.util.Scanner;

public class NumberCount
{
    int findElementCount(int a,int [] arr,int c)
    { 
        int count=0;
       for(int i=0;i<a;i++)
       {
           if(arr[i]==c)
           {
               count++;
           }
       }
       return count;
    }
	public static void main(String[] args) {
	  NumberCount m=new NumberCount();
	    int[] array=new int[20];
	    Scanner sc=new Scanner(System.in);
        System.out.println("Size");
        int n=sc.nextInt();
        if(n<0)
        {
        System.out.println("Invalid input");
        System.exit(0);
        }
        else{
        System.out.println("elements into array");
        for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
        if(array[i]>0)
        {
            
        }
        else{
            
             System.exit(0);
			 System.out.println("Invalid input");
            }
        }
    
        System.out.println("Searhing the element");
        int search=sc.nextInt();
        
        int res=m.findElementCount(n,array,search);
        System.out.println("Number count:"+res);
        
	}
	}
}