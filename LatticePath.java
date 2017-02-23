/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc:
 */

import java.math.BigInteger;

public class LatticePath {

	static BigInteger arr[][] = new BigInteger[200][200];

	public static void main (String[] args) {
		BigInteger k = BigInteger.valueOf(0);
		int n = 199;
		int t = 2;
		for(int i=0;i<n;i++) {
			arr[i][0] = k.add(BigInteger.valueOf(t));
			arr[0][i]=k.add(BigInteger.valueOf(t));
			t++;
		}

		System.out.println();

		for(int p=1;p<n;p++) {
			for(int i=p;i<n;i++) {
				for(int j=i;i<n;i++) {
					arr[i][j] = arr[i][j-1].add(arr[i-1][j]);
					arr[j][i] = arr[i][j-1].add(arr[i-1][j]);
					//arr[i][i] = arr[i-1][i].add(arr[i][i-1]);
				}
			}
		}

		System.out.println();

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(arr[200][200]);

	}

}
