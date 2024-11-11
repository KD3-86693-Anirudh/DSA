import java.io.*;
import java.util.*;

public class q1 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array:- ");
		 int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < arr.length ; i++) {
				System.out.println("Enter " + i + " element of array");
				arr[i] = scn.nextInt();
			}
			System.out.println("Enter the element to be searched for last index");
			int key = scn.nextInt();
			int last = 0;
			
			for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == key) {
				last = i;
			}	
			}
			
			System.out.println("The last index of " + key + " is " + last);
	}

}
