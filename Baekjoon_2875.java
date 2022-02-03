import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2875 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int team = 0;
		//최대 팀수 구하는 반복문
		while(true) {
			N -= 2;
			M -= 1;
			team++;
			if(N < 2 || M == 0) {
				break;
			}
		}
		
		//팀을 짜고 남은 인원 수가 인턴쉽 가는 사람 수보다 적을때
		if(N + M < K) {
			if(K > 2) {
				K -= (N + M);
				//팀 인원 수는 3명이다. 그러니 인턴쉽을 3명 기준으로 자른다.
				if(K % 3 != 0) {
					team -= ((K / 3) + 1);
				}else {
					team -= (K / 3);
				}
			}else {
				team -= 1;
			}
		}
		System.out.println(team);
	}

}
