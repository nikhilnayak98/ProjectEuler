/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date:
 * Brief Desc:
 */

import java.util.Scanner;

public class MaxSumPath {
  
  public static void main (String[] args) throws Exception {
    int size = 100;
    int[][] triangle = new int[size][size];

    Scanner sc = new Scanner(System.in);
    try {
      for(int i = 0; i < size; i++) {
        String[] nums = sc.nextLine().split("\\s");
        for(int j = 0; j <= i; j++){
          int num = Integer.parseInt(nums[j]);
          triangle[i][j] = num;
        }
      }
    } catch(Exception e) {
      System.out.println(e);
    }

    for(int r = size - 2; r >= 0; r--) {
      for(int c = 0; c <= r; c++) {
        int below = triangle[r+1][c];
        int bandr = triangle[r+1][c+1];
        int max = Math.max(below, bandr);
        triangle[r][c] += max;
      }
    }
    
    System.out.println("MAX PATH SUM: " + triangle[0][0]);
    
  }
}
