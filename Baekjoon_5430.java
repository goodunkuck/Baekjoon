import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon_5430 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			Deque<Integer> deq = new LinkedList<Integer>();
			//뒤집힌 상태인지 확인하지위한 변수
			boolean reverse = false;
			//에러 여부를 확인하기위한 변수
			int error = 0;
			
			//입력받은 배열을 값만 빼서 토큰에 저장
			StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
			for(int j = 1; j < (n * 2); j += 2) {
				deq.offer(Integer.parseInt(st.nextToken()));
			}
			
			for(int j = 0; j < p.length(); j++) {
				if(p.charAt(j) == 'R') {
					if(reverse) reverse = false;
					else reverse = true;
				}else {
					//D가 왔는데 덱이 비어있으면 error에 1을 저장하고 반복 종료
					if(deq.isEmpty()) {
						error = 1;
						break;
					}
					if(reverse == false) deq.pollFirst();
					else deq.pollLast();
				}
			}
			
			if(error == 1) sb.append("error").append("\n");
			else {
				//reverse가 true면 뒤집힌 상태. 덱을 뒤집는 방법은 stack처럼
				//저장된 값을 맨 뒤 값부터 차례대로 제거 출력 해준다.
				if(reverse == true) {
					sb.append("[");
					while(!deq.isEmpty()) {
						sb.append(deq.pollLast());
						if(deq.isEmpty()) break;
						sb.append(",");
					}
					sb.append("]").append("\n");
				}else {
					sb.append("[");
					while(!deq.isEmpty()) {
						sb.append(deq.pollFirst());
						if(deq.isEmpty()) break;
						sb.append(",");
					}
					sb.append("]").append("\n");
				}
			}
		}
		System.out.println(sb);
	}

}
