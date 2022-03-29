import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_6603 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			
			if(K == 0) break;
			
			int[] arr = new int[K];
			
			for(int i = 0; i < K; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < K - 5; i++) {
				for(int j = i + 1; j < K - 4; j++) {
					for(int k = j + 1; k < K - 3; k++) {
						for(int l = k + 1; l < K - 2; l++) {
							for(int m = l + 1; m < K - 1; m++) {
								for(int n = m + 1; n < K; n++) {
									sb.append(arr[i]).append(" ").append(arr[j]).append(" ")
									.append(arr[k]).append(" ").append(arr[l]).append(" ")
									.append(arr[m]).append(" ").append(arr[n]).append("\n");
								}
							}
						}
					}
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
