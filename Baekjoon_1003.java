import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1003 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			//시작값은 0과 1
			int num1 = 0;
			int num2 = 1;
			
			for(int j = 0; j < N; j++) {
				//현재 j번째 값을 구하는 것인데, j가 짝수 여부로 차례로 계산한다.
				if(j % 2 == 0) {
					num2 += num1;
				}else {
					num1 += num2;
				}
			}
			
			//0번째 값은 1과 0이 와야하기 때문에 조건문으로 분류해서 출력해준다.
			//그 이후 값은 짝수 여부에 따라 순서를 다르게해서 출력
			if(N == 0) System.out.println(1 + " " + 0);
			else if(N % 2 == 0) System.out.println(num2 + " " + num1);
			else System.out.println(num1 + " " + num2);
		}
	}

}
