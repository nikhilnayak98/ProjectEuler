/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date:
 * Brief Desc:
 */

public class SmallestMultiple {

	public static void main(String[] args) {
		int j=1;
		int arr[] = new int[21];
		for(int i=1;i<=20;i++) {
			arr[i] = i;
		}
		while(j>=1) {
			if(j%arr[20]==0&&j%arr[19]==0&&j%arr[18]==0&&j%arr[17]==0&&j%arr[16]==0&&j%arr[15]==0&&j%arr[14]==0&&j%arr[13]==0&&j%arr[12]==0&&j%arr[11]==0&&j%arr[10]==0&&j%arr[9]==0&&j%arr[8]==0&&j%arr[7]==0&&j%arr[6]==0&&j%arr[5]==0&&j%arr[4]==0&&j%arr[3]==0&&j%arr[2]==0&&j%arr[1]==0) {
				System.out.println(j);
				System.exit(0);
			}
			j++;
		}

	}

}
