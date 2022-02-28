import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2231 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = N;
		int result = 0;
		
		while(true) {
			num--;
			String S = String.valueOf(num);
			int sum = num;
			
			for(int i = 0; i < S.length(); i++) {
				//자릿수를 더해주려면 int형으로 바꿔야하는데 
				//char형으로 뽑으면 그 값은 아스키코드 값을 갖기에 - '0'을 해줘야한다.
				sum += (S.charAt(i) - '0');
			}
			if(sum == N) result = num;
			if(num <= (N / 2)) break;
		}
		
		if(result >= (N / 2)) System.out.println(result);
		else System.out.println(0);
	}

}
