package Question1;

import java.util.Scanner;

public class StackMain {

	 public static void reverse(int arr[], int n)
	    {
	 
	        Stack obj = new Stack(n);
	 
	        for (int i = 0; i < n; i++) {
	 
	            obj.push(arr[i]);
	        }
	 
	        for (int i = 0; i < n; i++) {
	 
	            arr[i] = obj.pop();
	        }
	 
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	 
	    public static void main(String args[])
	    {
	        int n = 4;
	 
	        int[] a = new int[] { 100, 200, 300, 400 };
	 
	        reverse(a, n);
	    }
	}