import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_13866 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		
		//배열에 입력값을 저장
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//정렬
		Arrays.sort(arr);
		
		//합의 차이를 구하고 절대값을 출력
		System.out.println(Math.abs((arr[0] + arr[3]) - (arr[1] + arr[2])));
		
	}

}
