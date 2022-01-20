import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_8370 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i == 1) {
				sum += (arr[0] * arr[1]);
			}
			if(i == 3) {
				sum += (arr[2] * arr[3]);
			}
		}
		
		System.out.println(sum);
	}

}
