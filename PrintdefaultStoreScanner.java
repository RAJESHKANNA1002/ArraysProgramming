package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class PrintdefaultStoreScanner {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	char ch[]=new char [3];
	System.out.println(Arrays.toString(ch));
	for (int i = 0; i <3; i++) {
		ch[i]=sc.next().charAt(0);
	}
	System.err.println(Arrays.toString(ch));
	}
}
