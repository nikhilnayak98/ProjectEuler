/*
 * Author: Nikhil Ranjan Nayak
 */

public class NumLetterSum {
	
	static String[] ONES = {
			"zero", 
			"one", 
			"two", 
			"three",
			"four", 
			"five", 
			"six", 
			"seven", 
			"eight", 
			"nine"
	};
	static String[] TEENS = {
			"ten", 
			"eleven", 
			"twelve", 
			"thirteen", 
			"fourteen", 
			"fifteen",
			"sixteen", 
			"seventeen", 
			"eighteen", 
			"nineteen"
	};
	static String[] TENS = {
			"twenty", 
			"thirty", 
			"forty", 
			"fifty",
			"sixty", 
			"seventy", 
			"eighty", 
			"ninety"
	};

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=1000;i++)
			sum += toEnglish(i).length();
		System.out.println(Integer.toString(sum));
	}

	public static String toEnglish(int n) {
		if(n<0||n>99999)
			throw new IllegalArgumentException();

		if(n<100)
			return tens(n);
		else {
			String big = "";
			if(n>=1000)
				big += tens(n/1000) + "thousand";
			if(n/100%10!=0)
				big += ONES[n/100%10] + "hundred";

			return big+(n%100!=0 ? "and" + tens(n%100) : "");
		}
	}


	public static String tens(int n) {
		if(n<10)
			return ONES[n];
		else if(n<20)
			return TEENS[n-10];
		else
			return TENS[n/10-2] + (n%10!=0 ? ONES[n%10] : "");
	}

}
