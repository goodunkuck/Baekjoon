import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5692 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//결과값을 저장할 StringBuilder
		StringBuilder sb = new StringBuilder();
		
		//무한루프
		while(true) {
			String S = br.readLine();
			//S의 길이
			int size = S.length();
			int sum = 0;
			
			//0입력시 종료
			if(S.equals("0")) break;
			
			//문자열 0인덱스부터 마지막인덱스까지 반복하는 반복문
			for(int i = 0; i < S.length(); i++) {
				int n = S.charAt(i) - '0';
				//숫자 1을 곱해주는 의미가 없기때문에 2부터 시작
				//범위를 S.length()가 아닌 size로 정의한 이유는 자릿수가
				//넘어갈 수록 곱해줄 최댓값도 줄어들어야하기 때문이다.
				for(int j = 2; j <= size; j++) {
					n *= j;
				}
				sum += n;
				size--;
			}
			//여기서 출력해도 문제는 풀 수 있지만 시간이 오래 걸린다.
			//System.out.println(sum);
			
			//그러니 StringBuilder를 사용한다.
			sb.append(sum).append("\n");
		}
		//저장해준 결과값을 출력한다.
		System.out.println(sb);
	}

}
