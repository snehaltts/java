import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VehicleMain {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Two Wheeler");
		System.out.println("2.Four Wheeler");
        int no = Integer.parseInt(br.readLine());
        if(no==1) {
        	System.out.println("Vehicle Make:");
        	String make= br.readLine();
        	System.out.println("Vehicle number:");
        	String num= br.readLine();
        	System.out.println("Fuel type:");
        	System.out.println("1-Petrol");
        	System.out.println("2-Diesel");
        	int t= Integer.parseInt(br.readLine());
        	String fuel="";
        	if(t==1) {
        		fuel="Petrol";
        	}
        	else if(t==2) {
        		fuel="Diesel";
        	}
        	else {
        		fuel="";
        	}
        	System.out.println("Fuel capacity:");
        	int cap = Integer.parseInt(br.readLine());
        	System.out.println("Cc");
        	int cc= Integer.parseInt(br.readLine());
        	System.out.println("Kick start Avaiable [Yes/No]:");
        	String im = br.readLine();
        	boolean b= true;
        	if(im.equalsIgnoreCase("Yes")) {
        		b=true;
        	}
        	else {
        		b=false;
        	}
        	TwoWheeler tw = new TwoWheeler(make,fuel,num,cap,cc,b);
        	tw.displayMake();
        	tw.displayBasicInfo();
        	tw.displayDetailInfo();
        }
        else if(no==2) {
        	
        	System.out.println("Vehicle Make:");
        	String make= br.readLine();
        	System.out.println("Vehicle number:");
        	String num= br.readLine();
        	System.out.println("Fuel type:");
        	System.out.println("1-Petrol");
        	System.out.println("2-Diesel");
        	int t= Integer.parseInt(br.readLine());
        	String fuel="";
        	if(t==1) {
        		fuel="Petrol";
        	}
        	else if(t==2) {
        		fuel="Diesel";
        	}
        	else {
        		fuel="";
        	}
        	System.out.println("Fuel capacity:");
        	int cap = Integer.parseInt(br.readLine());
        	System.out.println("Cc");
        	int cc= Integer.parseInt(br.readLine());
        	System.out.println("Kick start Avaiable [Yes/No]:");
        	String im = br.readLine();
        	boolean b= true;
        	if(im.equalsIgnoreCase("Yes")) {
        		b=true;
        	}
        	else {
        		b=false;
        	}
        	
        	TwoWheeler tw = new TwoWheeler(make,fuel,num,cap,cc,b);
        	tw.displayMake();
        	tw.displayBasicInfo();
        	tw.displayDetailInfo();
        	
        }
        else {
        	System.out.println("Invalid Input");
        }
	}


}


