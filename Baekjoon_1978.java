import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1978 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[1001];
		
		//0과 1은 소수가 아니다
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i * i <= 1000; i++) {
			if(!arr[i]) {
				for(int j = i * i; j <= 1000; j += i) {
					arr[j] = true;
				}
			}
		}
		
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int input = Integer.parseInt(st.nextToken());
			if(!arr[input]) count++;
		}
		System.out.println(count);
	}

}
