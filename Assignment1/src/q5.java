
public class q5 {
	public static void main(String[] args) {
	
		int[] arr = {0,2,5,1,2,3,0,2,1,3};
		int ele = 2;
		int occ = 2;
		int found = 0;

		for(int i =0; i< arr.length; i++) {
			if(ele == arr[i]) {
				found++;
				if(occ == found) {
					System.out.println("The element " + ele + " occured " + occ + " time on index " + i);
					break;
				}
			}
			
		}
		if(occ != found) {
			System.out.println("-1");
		}
	}
}
