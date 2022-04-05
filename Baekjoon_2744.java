import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2744 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String result = "";
		
		for(int i = 0; i < S.length(); i++) {
			if(65 <= S.charAt(i) && S.charAt(i) <= 90) {
				result += (char) (S.charAt(i) + 32);
			}else {
				result += (char) (S.charAt(i) - 32);
			}
		}
		System.out.println(result);
	}

}
