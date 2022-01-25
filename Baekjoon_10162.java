import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10162 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		//T가 10의 배수가 아니라면 -1을 출력
		if(T % 10 != 0) {
			System.out.println(-1);
		}else {
			//A에 5분으로 몇번을 설정해야하는지 값을 저장
			int A = T / 300;
			//5분으로 설정을 했으니 설정하고 남은 값을 T에 저장
			T %= 300;
			//B에 1분으로 몇번을 설정해야하는지 값을 저장
			int B = T / 60;
			//1분으로 설정을 했으니 설정하고 남은 값을 T에 저장
			T %= 60;
			//10초는 10을 나눠주면 끝나는 것이기에 그냥 출력에서 바로 연산
			System.out.println(A + " " + B + " " + (B / 10));
		}
	}

}
