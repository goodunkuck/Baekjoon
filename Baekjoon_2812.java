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
			
			//�� �տ� ������ �����ֱ� ���� max�� ����.
			if(i <= K && S.charAt(i) > max) max = S.charAt(i);
		}
		
		//max������ ���� ���� �� �տ� ��ġ�� ������ �������ش�.
		while(deq.peekFirst() < max) {
			deq.pollFirst();
			count--;
		}
		
		//deq2�� ����ֱ⶧���� ���۰��� �Ű��ش�.
		deq2.offer(deq.pollFirst());
		//count�� 0�� �ƴϸ� ����ؼ� �ݺ�.
		while(count > 0) {
			deq2.offer(deq.pollFirst());
			//deq������ ���� �Ű��ְԵǸ� deq�� ���� ���� ���⿡ �������ش�.
			if(deq.isEmpty()) break;
			
			while(deq2.getLast() < deq.getFirst() && count != 0) {
				deq2.pollLast();
				count--;
			}
		}
		
		//deq�� ���� ���� ������ ���� �� deq2�� �����Ѵ�.
		while(!deq.isEmpty()){
			deq2.offer(deq.pollFirst());
		}
		
		//���� Ƚ���� �����ִٸ� ������ ������ �������ָ� �Ǳ⶧���� ��¿��� ���ְ� ����Ѵ�.
		for(int i = 0; i < N - K; i++) {
			sb.append(deq2.pollFirst());
		}
		
		System.out.println(sb);
	}

}
