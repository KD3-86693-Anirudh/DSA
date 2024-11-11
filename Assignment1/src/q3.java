import java.io.*;
import java.util.*;

 class employee{
	int empid;
	String name;
	
	employee(int empid, String name){
		this.empid = empid;
		this.name = name;
	}

	public employee() {
	}
		
}

public class q3 {
		
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);	
	
	employee[] e = new employee[5];

	e[0] = new employee(1,"Anirudh");
	e[1] = new employee(2,"Suresh");
	e[2] = new employee(3,"Hari Om");
	e[3] = new employee(4,"Ritik");
	e[4] = new employee(5,"Dikshant");
	
	int n = 0;

	while (n != 3) {
		System.out.println("Enter 1. to search employee by empid");
		System.out.println("Enter 2. to search employee by name");
		System.out.println("Enter 3. to Exit");
		n = scn.nextInt();
		scn.nextLine(); 
	  
		if (n == 1) {
			System.out.println("Enter id to Search");
			int key1 = scn.nextInt();		
			empsearch(e, key1);
		} else if (n == 2) {
			System.out.println("Enter name to Search");
			String key2 = scn.nextLine(); 
			namesearch(e, key2);
		} else if (n == 3) {
			System.out.println("Exiting..");
		} else {
			System.out.println("Wrong input");
		}
	}

   
 
}

public static void empsearch(employee[] e, int key1) {

	for(int i =0; i< e.length; i++) {
		if(e[i].empid == key1) {
			System.out.println("The employee is at index:- " + i + " , and elements are [" + e[i].empid + ", " + e[i].name + "]");
			break;
		}
	}
	
}

public static void namesearch(employee[] e, String key2) {
	for(int i =0; i< e.length; i++) {
		if(e[i].name.equals(key2)) {
			System.out.println("The employee is at index:- " + i + " , and elements are [" + e[i].empid + ", " + e[i].name + "]");
			break;
		}
	}
}

}
