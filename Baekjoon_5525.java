import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5525 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String S = br.readLine();
		int[] count = new int[M];
		int result = 0;
		
		for(int i = 1; i < (M - 1); i++) {
			if(S.charAt(i) == 'O' && S.charAt(i + 1) == 'I') {
				count[i + 1] = count[i - 1] + 1;
				if(count[i + 1] >= N && S.charAt(i - ((2 * N) - 1)) == 'I') {
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
