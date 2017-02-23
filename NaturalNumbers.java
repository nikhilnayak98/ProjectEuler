/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Natural Numbers
 */

public class NaturalNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=3;i<=999;i++) {
			if((i%3)==0||(i%5)==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
