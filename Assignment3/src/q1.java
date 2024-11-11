 import java.util.*;

 public class q1 {
 public static void main(String[] args) {
	
	Stack<Integer> st = new Stack<>();
    
	int[] arr = new int[5];
    
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    
    for(int i = 0; i<5; i++) {
    	st.push(arr[i]);	
    }
        
    for(int k = 0; k<5; k++) {
    	System.out.println(st.pop()); 
    	
    }
    	
}
}
