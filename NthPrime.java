
public class NthPrime {

	public static void main(String[] args) {
		int t = 1;
		for(int i=1;i<=150000;i++) {
			int ctr = 0;
			int j;
			for(j=1;j<=i;j++) {
				if(i%j==0) { ctr++; }
			}
			
			if(ctr==2) { System.out.println(t + " - " + i + " "); t++;}
		}

	}

}
