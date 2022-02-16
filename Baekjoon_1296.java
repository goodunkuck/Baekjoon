import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1296 {
	//LOVE ö�ڸ��� ������ �����ϱ� ���� �迭
	static int[] arr = new int[4];
	//�ִ��� 100���� �������� 0�� �� ���� �ֱ� ������ -1�� ����
	static int max = -1;
	static String love = "LOVE";
	//���Ȯ���� ���� �� �̸��� �����ϱ� ���� ����
	static String win = "";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Ename = br.readLine();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String Tname = br.readLine();
			
			//L���� E���� ���������� �� �̸��� ���� �̸��� ���Ե� ������ �迭�� ����
			for(int j = 0; j < 4; j++) {
				int sum = Ename.length() - Ename.replace(String.valueOf(love.charAt(j)), "").length();
				sum += Tname.length() - Tname.replace(String.valueOf(love.charAt(j)), "").length();
				arr[j] = sum;
			}
			
			//(L+O) �� (L+V) �� (L+E) �� (O+V) �� (O+E) �� (V+E)�� ���� ���� �����ϱ� ���� ����
			int total = 1;
			
			//�����ϴ� �ݺ���
			for(int j = 0; j < 4; j++) {
				for(int k = (j + 1); k < 4; k++) {
					total *= (arr[j] + arr[k]);
				}
			}
			
			//���� Ȯ�� �ִ񰪰� �̹� ���̸��� Ȯ�� ���� ������
			if(max == (total % 100) && win != "") {
				String[] arr2 = new String[2];
				arr2[0] = win;
				arr2[1] = Tname;
				Arrays.sort(arr2);
				win = arr2[0];
			}
			
			//���̸��� Ȯ�� ���� �� Ŭ��
			if(max < (total % 100)) {
				max = total % 100;
				win = Tname;
			}
		}
		System.out.println(win);
	}

}
