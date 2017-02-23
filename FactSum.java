import java.math.BigInteger;

public class FactSum {

	public static void main(String[] args) {
		long n = 100;
		BigInteger n1 = BigInteger.valueOf(100);
		BigInteger zero = BigInteger.valueOf(0);
		BigInteger b1 = factorial(n1);
		BigInteger r, sum = zero;		
		while(b1.compareTo(zero)>0) {
			r = b1.mod(new BigInteger("10"));
			sum = sum.add(r);
			b1 = b1.divide(new BigInteger("10"));
		}
		System.out.println(sum);
	}
	
	public static BigInteger factorial(BigInteger n) {
		BigInteger b = BigInteger.valueOf(1);
		if(n.compareTo(BigInteger.valueOf(0))==0)
			return BigInteger.valueOf(1);
		else
			return ((n.multiply(factorial(n.subtract(b)))));
	}

}
