import java.text.DecimalFormat;

/*
 * Author: Nikhil Ranjan Nayak
 */

public class PrimeSum {

	public static void main(String[] args) {
		double sum = 0;
		for(int i=2;i<=2000000;i++) {
			if(!checkp(i)) {
				sum+=i;
			}
		}
		System.out.println(new DecimalFormat().format(sum));
	}
	
	public static boolean checkp(int i) {
		int ctr=0;
		for(int j=1;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				ctr++;
			}
		}
		if(ctr==2)
			return true;
		return false;
	}

}
