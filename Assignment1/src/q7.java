import java.util.*;

public class q7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = {10,20,15,3,4,4,1};
		Arrays.sort(arr);
		System.out.println("Enter the element whose rank you want to check");
		int x = scn.nextInt();
		for(int i= arr.length -1; i >= 0; i--) {
                 if(x == arr[i]) {
                	 System.out.println("Rank of Element is " + (i+1));
                	 break;
                 }
		}

}
}
