import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11050 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		//분모
		int up = 1;
		//분자
		int down = 1;
		
		for(int i = 0; i < K; i++) {
			up *= (N - i);
			down *= (i + 1);
		}
		System.out.println(up / down);
	}

}
