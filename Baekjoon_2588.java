import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2588 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		String S = String.valueOf(B);
		
		for(int i = 2; i >= 0; i--) {
			//1의 자리수부터 뽑아내서 연산하는것이다.
			//숫자 char형을 정수화 시키기 위해 '0'을 빼준다.
			System.out.println((S.charAt(i) - '0') * A);
		}
		System.out.println(A * B);
		
	}

}
