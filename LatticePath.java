/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc:
 */

public class LatticePath {
  
  public static void main (String[] args) throws Exception {
    int size = 21;
    long[][] pts=new long[size][size];
    
    pts[0][0] = 1;
    for(int i = 1; i < size; i++) {
      pts[i][0] = 1;
      pts[0][i] = 1;
    }
    
    for(int r = 1; r < size; r++) {
      pts[r][r] = pts[r-1][r] + pts[r][r-1];
      
      for(int c = r + 1; c < size; c++) {
        pts[r][c] = pts[r-1][c] + pts[r][c-1];
        pts[c][r] = pts[c-1][r] + pts[c][r-1];
      }
    }
    
    long paths = pts[size-1][size-1];
    
    System.out.println("PATHS: "+paths);
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        System.out.println(pts[i][j] + " ");
      }
      System.out.println();
    }
  }
}

