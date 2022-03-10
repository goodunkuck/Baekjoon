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
		StringBuilder sb = new StringBuilder();
		int count = K;
		
		String S = br.readLine();
		//���� ���� ����.
        deq.offer(S.charAt(0));
        //0�ε��� ���� �̹� ���� ������ 1�ε������� �ݺ�
		for(int i = 1; i < N; i++) {
			char ichar = S.charAt(i);
			//���� ������ ���� ������ ���ǵ��� �����Ǵ� �� ��� ����.
			while(deq.getLast() < ichar && count != 0) {
				deq.pollLast();
				count--;
				//���� ��ԵǸ� �ݺ� ����
                if(deq.isEmpty()) break;
			}
			deq.offer(S.charAt(i));
		}
		
        int size = deq.size();
        //count�� ���� �������� ���� �ֱ⿡ count���� ������ ������ŭ�� ���
		for(int i = 0; i < size - count; i++) {
			sb.append(deq.pollFirst());
		}
		
		System.out.println(sb);
	}

}
