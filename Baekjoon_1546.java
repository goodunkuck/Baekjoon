import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1546 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//입력값을 저장 할 배열
		double[] arr = new double[N];
		//최댓값을 저장 할 변수
		double max = 0;
		//합을 저장 할 변수
		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			
			//입력값이 max값보다 크면 max에 저장
			if(max < arr[i]) max = arr[i];
		}
		
		//새로운 식을 연산하기위한 반복문
		for(int i = 0; i < N; i++) {
			sum += ((arr[i] / max) * 100);
		}
		//총합을 구했으니 점수 개수로 나눠주고 출력
		System.out.println(sum / N);
	}

}
