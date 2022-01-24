import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5543 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//최소값을 저장하기 위한 변수 선언. 값은 최대로 설정할 수 있는 가격인 2000원
		int Amin = 2000;
		int Bmin = 2000;
		
		//햄버거 값이 입력될 때마다 최소값을 갱신
		for(int i = 0; i < 3; i++) {
			int N = Integer.parseInt(br.readLine());
			if(N < Amin) {
				Amin = N;
			}
		}
		//음료 값이 입력될 때마다 최소값을 갱신
		for(int i = 0; i < 2; i++) {
			int N = Integer.parseInt(br.readLine());
			if(N < Bmin) {
				Bmin = N;
			}
		}
		//두 음식의 최소값을 더하고 세트 할인 값을 적용
		System.out.println(Amin + Bmin - 50);
	}

}
