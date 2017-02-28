/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date:
 * Brief Desc:
 */

import java.math.BigInteger;

public class AmicableNumbers {

	public static void main(String[] args) {
		BigInteger sum =  new BigInteger("0");
		BigInteger sum1 =  new BigInteger("0");
		for(long i=1;i<=5;i++) {
			for(long j=1;j<Math.sqrt(i);i++) {
				if(i%j==0)
					sum = sum.add(BigInteger.valueOf(j));
			}
			boolean flag = checkAmmicable(sum);
			if(flag==true)
				sum1 = sum1.add(sum);
			sum = new BigInteger("0");
		}
		System.out.println("Sum - " + sum);
	}
	
	public static boolean checkAmmicable(BigInteger s) {
		BigInteger sum2 = new BigInteger("0");
		for(long i=1;i<Math.sqrt(s.longValue());i++) {
				if(s.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO))
					sum2 = sum2.add(BigInteger.valueOf(i));
		}
		if(sum2.equals(s))
			return true;
		else
			return false;
	}

}
