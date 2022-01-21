import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11283 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		char C = S.charAt(0);
		System.out.println((int) C - 44031);
	}

}
