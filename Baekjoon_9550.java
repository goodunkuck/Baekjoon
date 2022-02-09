import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9550 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			//만족시킬 아이들의 수를 저장할 변수
			int count = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int candy = Integer.parseInt(st.nextToken());
				//입력된 캔디의 갯수를 먹었을때 만족하는 조건의 값인 K를 나눠준다.
				count += candy / K;
			}
			System.out.println(count);
		}
	}

}
