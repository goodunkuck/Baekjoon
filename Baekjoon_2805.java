import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2805 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max < arr[i]) max = arr[i];
		}
		
		int start = 0;
		int end = max;
		int mid = (end + start) / 2;
		int result = 0;
		//이분탐색 범위가 0이 될때까지 반복하는 반복문
		while(end - start >= 0) {
			//범위가 나무의 개수는 100만개이고, 길이는 20억 이상이라면 int형을 넘어선다.
			//합은 long형으로 구한다.
			long sum = 0;
			for(int i = 0; i < N; i++) {
				if(arr[i] > mid) sum += (arr[i] - mid);
			}
			
			if(sum >= M) {
				start = mid + 1;
				result = mid;
			}else if(sum < M) {
				end = mid - 1;
			}
			mid = (end + start) / 2;
		}
		System.out.println(result);
	}

}
