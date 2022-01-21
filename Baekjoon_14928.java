import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14928 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		long result = 0;
		
		for(int i = 0; i < S.length(); i++) {
			result = (((result * 10) + (S.charAt(i) - '0')) % 20000303);
		}
		System.out.println(result);
	}

}
