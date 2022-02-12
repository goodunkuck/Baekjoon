import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1032 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//�Է°����� ���� �� �迭
		String[] arr = new String[N];
		
		//�Է°����� �迭�� ����
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		//�迭�� ������ ���� �ε����� �ִ� ������ ���� �ݺ����� ���ǹ�
		for(int i = 0; i < arr[0].length(); i++) {
			//���� ����Ҷ� �ε����� �ִ� ���� �������, ?�� ������� �����ϱ� ���� ������ ����
			int count = 0;
			for(int j = 0; j < (N - 1); j++) {
				if(arr[j].charAt(i) != arr[j + 1].charAt(i)) {
					break;
				}
				count++;
			}
			if(count == (N - 1)) {
				System.out.print(arr[0].charAt(i));
			}else {
				System.out.print("?");
			}
		}
	}

}
