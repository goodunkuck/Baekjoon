import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1546 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//�Է°��� ���� �� �迭
		double[] arr = new double[N];
		//�ִ��� ���� �� ����
		double max = 0;
		//���� ���� �� ����
		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			
			//�Է°��� max������ ũ�� max�� ����
			if(max < arr[i]) max = arr[i];
		}
		
		//���ο� ���� �����ϱ����� �ݺ���
		for(int i = 0; i < N; i++) {
			sum += ((arr[i] / max) * 100);
		}
		//������ �������� ���� ������ �����ְ� ���
		System.out.println(sum / N);
	}

}
