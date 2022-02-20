import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_1158 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		//now = ���� �ε��� ���� ������ ����
		//size�� �ִ� �ε��� ���� ������ ����
		int now = K;
		int size = N;
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			list1.add(i);
		}
		
		//�ش� �ε��� ���� list1���� list2�� �̵����ְ�, list1������ �������ش�.
		for(int i = 0; i < N; i++) {
			list2.add(list1.get(now - 1));
			list1.remove(now - 1);
			now += (K - 1);
			size--;
			
			if(size != 0) {
				//�ִ񰪺��� ���� ���� Ŀ����, ���簪�� �ִ񰪺��� �۾��������� �ִ��� ���ش�.
				//��� ���ִ� ������ �ִ��� ���� �۾�����, ���簪�� �߰��Ǵ� ���� ���⶧����
				//�ִ��� �۾������� ������ϴ� Ƚ���� �þ ���̴�.
				while(now > size) {
					now -= size;
				}
			}
		}
		//���.
		System.out.print("<");
		for(int i = 0; i < N; i++) {
			if(i == (N - 1)) System.out.print(list2.get(i) + ">");
			else System.out.print(list2.get(i) + ", ");
		}
	}

}
