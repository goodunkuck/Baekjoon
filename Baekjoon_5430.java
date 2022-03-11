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
			//������ �������� Ȯ���������� ����
			boolean reverse = false;
			//���� ���θ� Ȯ���ϱ����� ����
			int error = 0;
			
			//�Է¹��� �迭�� ���� ���� ��ū�� ����
			StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
			for(int j = 1; j < (n * 2); j += 2) {
				deq.offer(Integer.parseInt(st.nextToken()));
			}
			
			for(int j = 0; j < p.length(); j++) {
				if(p.charAt(j) == 'R') {
					if(reverse) reverse = false;
					else reverse = true;
				}else {
					//D�� �Դµ� ���� ��������� error�� 1�� �����ϰ� �ݺ� ����
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
				//reverse�� true�� ������ ����. ���� ������ ����� stackó��
				//����� ���� �� �� ������ ���ʴ�� ���� ��� ���ش�.
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
