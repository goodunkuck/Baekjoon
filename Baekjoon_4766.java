import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4766 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(br.readLine());
		
		//무한루프
		while(true) {
			double N2 = Double.parseDouble(br.readLine());
			//무한루프 종료
			if(N2 == 999) {
				break;
			}
			//소수점 2번째자리까지 무조건 표시
			System.out.println(String.format("%.2f", (N2 - N)));
			//현재값을 다음 값에 뺴줘야하기 때문에 N에 저장해서 계속해서 이전값과 연산해준다.
			N = N2;
		}
	}

}
