import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1037 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		//0 ~ 1000000까지의 값이 약수로 올 수 있기 때문에 최솟값 최댓값이 기준을 이렇게 잡는다.
		long min = 1000000;
		long max = 0;
		
		for(int i = 0; i < N; i++) {
			long num = Long.parseLong(st.nextToken());
			
			//최댓값 최솟값 저장
			if(num < min) min = num;
			if(num > max) max = num;
		}
		
		
		System.out.println(min * max);
	}

}
