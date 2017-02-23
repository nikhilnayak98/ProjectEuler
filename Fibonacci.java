/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Fibonacci
 */

public class Fibonacci {

	public static void main(String[] args) {
		int sum = 0;
		int a = 0,b = 1;
		while(sum<4000000) {
			if(a%2==0) {
				sum+=a;
				System.out.println(a);
			}
			if(b%2==0) {
				sum+=b;
				System.out.println(b);
			}
			a=a+b;
			b=a+b;
		}
		System.out.println("Sum = " + sum);
	}

}
