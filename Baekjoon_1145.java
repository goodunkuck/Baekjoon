import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1145 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�Է°����� �������� �迭 ����
		int[] arr = new int[5];
		//��� �Է°��� ������ ���������� üũ�� ����
		int count = 0;
		//������� ������ ����
		int N = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//��� 3���̻��� �������� �𸣱� ������ ���ѷ���
		while(true) {
			N++;
			//N���� �������� �Է°����� ������ �������� count +1
			for(int i = 0; i < 5; i++) {
				if(N >= arr[i] && N % arr[i] == 0) count++;
			}
			//3���̻� �������� ���ѷ��� ����
			if(count > 2) break;
			//3���̻� �������� �ʾ����� count �ʱ�ȭ
			count = 0;
		}
		System.out.println(N);
	}

}
