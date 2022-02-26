import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1654 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];
		int end = 0;
		
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			//�Է°��� ���� ū ���� ����
			if(end < arr[i]) end = arr[i];
		}
		
		//������ 1����
		int start = 1;
		//�߰� ��
		int mid = (end + start) / 2;
		//��� ���� ���� �� �����̴�. 
		//������ �ϳ��̰�, �ʿ��� ���� ������ 1���� ��� �Է� ���� ����ؾ��ϱ� ������ �ִ��� ����.
		int result = end;
		
		//���� �������� ������������ �ݺ�
		while(end - start >= 0) {
			//���� ������ ���� ���� �� ����, int���� �Ѿ �� �ֱ� ������ sum ������ long������ ����
			long sum = 0;
			
			for(int i = 0; i < K; i++) {
				sum += (arr[i] / mid);
				if(sum > N) break;
			}
			
			//������ ���� �ʿ��� ������ ���¾� �������� ���� ���� �� �̻��� ������ �ּڰ����� ���϶� �ߴ�.
			//�׷��� �ʿ��� ���� �̻��϶� ������ result�� ����
			if(sum >= N) {
				start = mid + 1;
				result = mid;
			}else {
				end = mid - 1;
			}
			
			mid = (end + start) / 2;
		}
		System.out.println(result);
	}

}
