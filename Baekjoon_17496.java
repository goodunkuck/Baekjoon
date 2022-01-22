import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17496 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		N -= 1;
		int count = 0;
		
		for(int i = 1; i < 90; i ++) {
			if(N > T) {
				N -= T;
			}else if(0 < N && N < T){
				count = i - 1;
				break;
			}else {
				count = i;
				break;
			}
		}
		System.out.println(count * C * P);
		
	}

}
