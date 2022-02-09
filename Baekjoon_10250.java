import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10250 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			//방번호를 저장하기위한 문자열 변수 선언.
			String room;
			
			if(N % H == 0) {
				room = String.valueOf(H);
				//방 번호가 예를 들어 403인데 그냥 두 수를 합치면 43이 되어버린다.
				//그렇기때문에 String.format을 사용해 방번호중 뒤 2자리를 앞에 0이 올 수 있게 만들어준다.
				room += String.format("%02d", (N / H));
			}else {
				room = String.valueOf(N % H);
				room += String.format("%02d", (N / H) + 1);
			}
			System.out.println(room);
		}
	}

}
