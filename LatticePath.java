/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc:
 */

public class LatticePath {

	static long arr[][] = new long[200][200];

	public static void main (String[] args) {
		long k = 2;
		int n = 200;
		for(int i=0;i<n;i++) {
			arr[i][0]=k++;
		}

		k=2;

		for(int j=0;j<n;j++) {
			arr[0][j]=k++;
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for(int p=1;p<n;p++) {
			for(int i=p;i<n;i++) {
				for(int j=i;i<n;i++) {
					arr[i][j] = arr[i][j-1] + arr[i-1][j];
					arr[j][i] = arr[i][j-1] + arr[i-1][j];
					arr[i][i] = arr[i-1][i] + arr[i][i-1];
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

	}

}
