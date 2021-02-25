import java.util.*;
import java.util.Scanner;

class EmployeeMain{  
public static void main(String[] args){
	Employee E = new Employee();
    E.setName("Sneha");
	E.setAddress("Hebbal");
	E.setMobile("123456789");
	
	System.out.println(E.getName()+" "+E.getAddress()+" "+E.getMobile());
}}