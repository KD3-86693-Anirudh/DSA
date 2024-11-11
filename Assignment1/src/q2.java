import java.io.*;
import java.util.*;


public class q2 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter the size of array:- ");
	 int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("Enter " + i + " element of array");
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter element to find:- ");
		int key = scn.nextInt();
//	linearcomp(arr , key);	
	binarycomp(arr, key); 
		
		
}

public static void linearcomp(int[] arr , int key) {
	Scanner scn = new Scanner(System.in);
	
	
	int comp = 1; 
	int i = 0;
	while(arr[i] != key || i == arr.length) {
		comp = comp+1;		
		i++;
	}
	System.out.println("Total comparisons done:- " + comp);
}


public static void binarycomp(int[] arr, int key) {
    int comp = 0;  
    int left = 0, right = arr.length - 1, mid;
    while (left <= right) {  
        mid = (left + right) / 2;
        comp++;  
        if (key == arr[mid]) {
            System.out.println("Total comparisons done: " + comp);
            return; 
        }
        else if (key < arr[mid]) {
            right = mid - 1; 
        }
        else {
            left = mid + 1;  
        }
    }
 
    System.out.println("Total comparisons done: " + comp);
}


}
