import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1629 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		System.out.println(pow(A, B, C));
	}
	
	public static long pow(int a, int b, int c) {
		if(b == 0) return 1;
		
		long res = pow(a, b / 2, c);
		
		if(b % 2 == 0) return res * res % c;
		else return (res * res % c) * a % c;
	}

}
