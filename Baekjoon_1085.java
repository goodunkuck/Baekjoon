import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1085 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		//x와 0과의 길이 x, x와 w와의 길이 w-x(y도 동일)
		int xcount = Math.min((w - x), x);
		int ycount = Math.min((h - y), y);
		
		//구한 두 길이중 작은 수 출력
		System.out.println(Math.min(xcount, ycount));
	}

}
