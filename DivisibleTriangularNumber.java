/*
 * Author: Nikhil Ranjan Nayak
 */

public class DivisibleTriangularNumber {

	public static void main(String[] args) {
		int term=0;
		int num = 0;
		for(int i=1;i<=44000;i++) {
			term+=i;
			num++;
			if(findDiv(term)==true) {
				System.out.println(num + " - " + term);
			}
		}

	}
	
	public static boolean findDiv(int n) {
		int ctr = 0;
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				ctr++;
			}
		}
		if(ctr>=500)
			return true;
		else
			return false;
	}

}
