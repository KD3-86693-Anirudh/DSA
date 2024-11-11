

public class q6 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
boolean flag = true;

		for(int i = 0; i < arr.length -1; i++) {
		
			for(int j = i+1; j< arr.length; j++) {
		
			if(arr[i] == arr[j]) {
				flag = false;
				break;
			} 
			
			if(j == arr.length -1 && arr[i] != arr[j]) {
				flag = true;
			}
			
			}
			
			if(flag == true) {
				System.out.println("The first non repeating number is:- " + arr[i]);
				break;
			}
		}	
	}

}

