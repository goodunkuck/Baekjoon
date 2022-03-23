import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1934 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int max = Math.max(A, B);
			int min = Math.min(A, B);
			
			int j = 1;
			while(true) {
				int Max = max * j;
				if(Max % min == 0) {
					System.out.println(Max);
					break;
				}else {
					j++;
				}
			}
		}
	}

}
