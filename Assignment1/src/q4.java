import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		int[] arr = {40,10,4,3,2};
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int result = binarySearch(arr, key);
		
		if(result == -1){
		    System.out.println("Element not found in the array.");
		} else {
		    System.out.println("Element found at index: " + result);
		}
		
	}
	
	public static int binarySearch(int[] arr, int key){
int left = 0;
int right = arr.length -1;
while(left<= right){
    int mid = (left+right)/2;
    if(key > arr[mid]){
        right = mid -1;
    } else if(key < arr[mid]){
        left = mid + 1;
    } else {
        return mid;
    }
    
    
}
 return -1;
	}
}
