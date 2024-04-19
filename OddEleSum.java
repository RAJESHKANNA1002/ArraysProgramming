package Arrays;

public class OddEleSum {

	public static void main(String[] args) {
		
		int a[]= {2,3,1,4,5,2,4};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
		
			if(i%2==1) {
				sum+=a[i];
			}
			
		}
		System.out.println(sum);
	}
}
