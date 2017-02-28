/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date:
 * Brief Desc:
 */

import java.util.ArrayList;

public class CollatzSequence {
	static int ctr = 0;
	static ArrayList<Integer> holder = new ArrayList<Integer>();

	public static void main(String[] args) {
		for(long i = 1000000;i>0;i--) {
			ctr = 0;
			Sequencer(i);
			holder.add(ctr);
		}
		long max = holder.get(0);
		for(int i=1;i<holder.size();i++) {
			if(holder.get(i)>=max)
				max = i;
		}
		System.out.println("Max = " + max);
		
	}
	
	public static void Sequencer(long num) {
		if(num==1) {
			ctr++;
			return;
		}
		else if(num%2==0) {
			num /= 2;
			ctr++;
			Sequencer(num);
		}
		else {
			num = (3*num) + 1;
			ctr++;
			Sequencer(num);
		}
	}

}
