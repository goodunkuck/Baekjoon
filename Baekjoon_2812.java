import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon_2812 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Deque<Character> deq = new LinkedList<Character>();
		Deque<Character> deq2 = new LinkedList<Character>();
		StringBuilder sb = new StringBuilder();
		int count = K;
		char max = 0;
		
		String S = br.readLine();
		for(int i = 0; i < N; i++) {
			deq.offer(S.charAt(i));
			
			//맨 앞에 값들을 지워주기 위한 max값 저장.
			if(i <= K && S.charAt(i) > max) max = S.charAt(i);
		}
		
		//max값보다 작은 값이 맨 앞에 위치해 있으면 제거해준다.
		while(deq.peekFirst() < max) {
			deq.pollFirst();
			count--;
		}
		
		//deq2가 비어있기때문에 시작값을 옮겨준다.
		deq2.offer(deq.pollFirst());
		//count가 0이 아니면 계속해서 반복.
		while(count > 0) {
			deq2.offer(deq.pollFirst());
			//deq마지막 값을 옮겨주게되면 deq에 남는 값이 없기에 종료해준다.
			if(deq.isEmpty()) break;
			
			while(deq2.getLast() < deq.getFirst() && count != 0) {
				deq2.pollLast();
				count--;
			}
		}
		
		//deq에 남은 값이 있으면 전부 다 deq2로 저장한다.
		while(!deq.isEmpty()){
			deq2.offer(deq.pollFirst());
		}
		
		//제외 횟수가 남아있다면 마지막 값들을 제외해주면 되기때문에 출력에서 빼주고 출력한다.
		for(int i = 0; i < N - K; i++) {
			sb.append(deq2.pollFirst());
		}
		
		System.out.println(sb);
	}

}
