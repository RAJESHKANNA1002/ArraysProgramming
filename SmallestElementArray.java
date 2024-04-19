package Arrays;

public class SmallestElementArray {

	public static void main(String[] args) {
		
		int a[]= {7,3,4,6,1,3};
		int s=a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(s>a[i]) {
				s=a[i];
			}
			
		}
		System.out.println(s);
	}
}
