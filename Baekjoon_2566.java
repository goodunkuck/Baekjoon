import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2566 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//최댓값을 저장할 변수 선언
		int max = 0;
		//행과 열 번호를 저장할 변수 선언
		String xy = "";
		
		//행과 열에 입력값을 넣어줄 for문
		for(int i = 1; i <= 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 9; j++) {
				int N = Integer.parseInt(st.nextToken());
				
				if(max < N) {
					max = N;
					xy = String.valueOf(i) + " " + String.valueOf(j);
				}
			}
		}
		System.out.println(max);
		System.out.println(xy);
	}

}
