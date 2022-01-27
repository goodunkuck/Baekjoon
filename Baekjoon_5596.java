import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5596 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = 0;
		int T = 0;
		//총 두줄의 입력값을 받음
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		//두줄의 입력값을 공백 기준으로 첫째줄은 S에 합산 다음 줄은 T에 합산
		for(int i = 0; i < 4; i ++) {
			S += Integer.parseInt(st.nextToken());
			T += Integer.parseInt(st2.nextToken());
		}
		//합이 큰 수를 출력하는데 같은 경우 S를 출력한다 했으니 S가 T보다 크거나 같음으로 조건함
		if(S >= T) {
			System.out.println(S);
		}else {
			System.out.println(T);
		}
	}

}
