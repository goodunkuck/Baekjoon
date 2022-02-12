import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10818 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min = 1000000, max = -1000000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			//입력값이 최댓값보다 크면 max에 저장
			if(num > max) max = num;
			
			//입력값이 최솟값보다 작으면 min에 저장
			if(num < min) min = num;
		}
		System.out.println(min + " " + max);
	}

}
