import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_7567 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int high = 0;
		
		for(int i = 0; i < S.length(); i++) {
			if(i > 0) {
				if(S.charAt(i) == '(') {
					if(S.charAt(i - 1) == '(') {
						high += 5;
					}else {
						high += 10;
					}
				}else {
					if(S.charAt(i - 1) == ')') {
						high += 5;
					}else {
						high += 10;
					}
				}
			}else {
				high += 10;
			}
		}
		System.out.println(high);
	}

}
