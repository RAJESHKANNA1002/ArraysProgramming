package Arrays;

public class FirstLargestElement {

	public static void main(String[] args) {
		
		int a[]= {2,14,7,3,5,7,3};
		int l=a[0];
		
		for (int i = 0; i < a.length-1; i++) {
			
			if(l<a[i]) {
				 l=a[i];
				
			}
			
		}
		System.out.println(l);
		System.out.println();
	}
}
