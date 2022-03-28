import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1011 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int length = y - x;
			int maxspeed = (int) Math.sqrt(length);
			int remain = (int) Math.ceil((length - Math.pow(maxspeed, 2)) / maxspeed);
			
			System.out.println(remain + (2 * maxspeed) - 1);
		}
	}

}
