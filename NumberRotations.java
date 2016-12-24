import java.io.*;
import java.util.*;

public class NumberRotations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,fdig,digits,tempNum,sum = 0,m,n;
		m = sc.nextInt();
		n = (int)Math.pow(10, m);

		if(m>=2&&m<=100) {
			for(int i=11;i<n;i++) {
				num = i;
				tempNum = num;
				digits = (int)Math.log10(num);
				fdig = num%10;
				num = num/10;
				num = fdig*(int)Math.pow(10, digits) + num;
				if(num%tempNum==0) {
					sum+=i;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
