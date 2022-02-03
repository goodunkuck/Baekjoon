import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_3009 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
		int X = 0;
		int Y = 0;
		
		//x1 과 x2가 같으면 x3가 솔로이기 때문에 x3를 대입
		//같은 방식으로 X와 Y를 구한다.
		if(x1 == x2) {
			X = x3;
		}else if(x1 == x3) {
			X = x2;
		}else {
			X = x1;
		}
		
		if(y1 == y2) {
			Y = y3;
		}else if(y1 == y3) {
			Y = y2;
		}else {
			Y = y1;
		}
		System.out.println(X + " " + Y);
	}

}
