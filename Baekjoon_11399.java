import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_11399 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//처음 입력값을 저장할 배열
		int[] arr = new int[N];
		//사람들이 돈을 뽑기위해 몇분 걸리는지 저장하기 위한 배열
		int[] result = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//정렬
		Arrays.sort(arr);
		
		//첫번째 사람은 자기 시간이 곧 돈뽑는데 걸리는 시간이니 그대로 저장
		result[0] = arr[0];
		
		//두번째부터 걸리는 시간을 연산해서 저장
		for(int i = 1; i < N; i++) {
			result[i] = result[i - 1] + arr[i];
		}
		
		int sum = 0;
		
		//모든 시간을 더한다.
		for(int i = 0; i < N; i++) {
			sum += result[i];
		}
		System.out.println(sum);
	}

}
