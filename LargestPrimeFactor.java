/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Largest Prime Factor
 */

public class LargestPrimeFactor {

	public static void main(String[] args) {
		long n=600851475143L;
		long big=0L;
		for(long i=2L; i<=n; i++){
			for(long l=1L; l<=Math.sqrt(i); l++){
				if(l%i==0){
					break;
				} else {
					while(n%i==0){
						n/=i;
						big=i;
					}
				}
			}
		}
		System.out.println(big);

	}

}
