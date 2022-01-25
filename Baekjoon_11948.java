import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_11948 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//4��¥�� ����� 2��¥�� ���� �迭 ����
		int[] arr = new int[4];
		int[] arr2 = new int[2];
		//�迭�� ����
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//����
		Arrays.sort(arr);
		//�ּڰ� �����ϰ� �ջ�
		int sum = arr[1] + arr[2] + arr[3];
		//������ �ΰ��� �迭�� ���� �Է�
		arr2[0] = Integer.parseInt(br.readLine());
		arr2[1] = Integer.parseInt(br.readLine());
		Arrays.sort(arr2);
		//ū ���� �ջ�
		sum += arr2[1];
		
		/*�� ������ ���� �ΰ��� ���� �ݺ��� ������� �ʰ� �μ��� Math �Լ���
		�ִ밪�� ���ؼ� �ִ밪�� sum�� ���ϴ� ����̴�.
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		sum += Math.max(A, B);*/
		
		System.out.println(sum);
	}

}
