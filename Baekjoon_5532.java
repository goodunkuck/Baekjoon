import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5532 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//문제에서 언급된 변수를 다 선언하자. 배열로 하고싶음 배열로 해도 된다.
		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		//국어와 수학 문제를 다 푸는데 걸리는 최대 일수를 구하기 위한 변수를 선언한다.
		int count = 0;
		
		//문제를 푸는데 반복 횟수 지정을 할 수 없으니 무한 루프로 돌리고 다 풀었을때 반복문을 탈출한다.
		while(true) {
			if(A <= 0 && B <= 0) {
				break;
			}
			A -= C;
			B -= D;
			count++;
		}
		//최대 일수(count)를 구했으면 그걸 방학 기간에서 뺸다.
		System.out.println(L - count);
		
	}

}
