import java.io.FileInputStream;
import java.util.Scanner;

public class NameSearch {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new FileInputStream("names.txt"));
		String s = ",";
		//FileInputStream file = new FileInputStream("names.txt");
		String arr[] = new String[1000];
		int i = 0;
		while(sc.hasNext()) {
			arr[i] = sc.next();
			i++;
		}
		i--;
		arr[i].split("\"(,\")?");
		System.out.println(arr[i]);
		
	}

}
