import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_11399 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//ó�� �Է°��� ������ �迭
		int[] arr = new int[N];
		//������� ���� �̱����� ��� �ɸ����� �����ϱ� ���� �迭
		int[] result = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//����
		Arrays.sort(arr);
		
		//ù��° ����� �ڱ� �ð��� �� ���̴µ� �ɸ��� �ð��̴� �״�� ����
		result[0] = arr[0];
		
		//�ι�°���� �ɸ��� �ð��� �����ؼ� ����
		for(int i = 1; i < N; i++) {
			result[i] = result[i - 1] + arr[i];
		}
		
		int sum = 0;
		
		//��� �ð��� ���Ѵ�.
		for(int i = 0; i < N; i++) {
			sum += result[i];
		}
		System.out.println(sum);
	}

}
