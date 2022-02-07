import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_6609 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
        
		//입력값이 null이 아니면 반복하는 반복문
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			int M = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			//M값에 번데기에서 넘어오는 값이 들어가게 되면 기존의 M값이 지워지기 때문에 변수를 하나 만들어 저장해준다.
			for(int i = 0; i < N; i++) {
				int m = M;
				M = P / S;
				P = L / R;
				L = m * E;
			}
			System.out.println(M);
		}
	}

}
