package Arrays;

import java.util.Arrays;

public class hi {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {100,200,300,400,500};
		int res[]=new int[a.length+b.length];
		
		for (int i = 0,m=0,n=b.length-1; i < res.length; i++) {
			
			if(i%2==0) {
				res[i]=a[m++];
			}
			
			else {
				res[i]=b[n--];
			}
			
		}
		System.out.println(Arrays.toString(res));
		
	}

}
