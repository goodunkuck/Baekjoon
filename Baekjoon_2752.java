import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_2752 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//���ڰ� 3���� ���ѵǾ��� ������ �迭�� ũ�⵵ 3���� ���Ѵ�.
		int[] arr = new int[3];
		
		//�ݺ����� ���� �迭�� ������� �Է� ���� �־��ش�.
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//Arrays Ŭ������ �ִ� sort�� �������ش�.
		Arrays.sort(arr);
		//�迭�� ����ϰ� �Ǹ� �ٸ� ��ȣ�� ��µǱ� ������ �ϳ��� ���� ����Ѵ�.
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
