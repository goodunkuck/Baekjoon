import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_18870 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//ó���� �Է¹��� ������ �˱����� �迭
		int[] input = new int[N];
		//�����ϱ����� �迭
		int[] Array = new int[N];
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			input[i] = num;
			Array[i] = num;
		}
		
		//����
		Arrays.sort(Array);
		
		//ù��°���� �켱 �����Ѵ�.
		hash.put(Array[0], 0);
		//���� ����
		int rank = 1;
		//�ε��� ����
		int index = 1;
		//�ε����� N���� ������ �ݺ��Ѵ�.
		while(index < N) {
			//�����߱� ������ �� �� ���� �ߺ��� �ƴҶ�
			if(Array[index] != Array[index - 1]) {
				hash.put(Array[index], rank);
				rank++;
			}
			//�ߺ��̸� ������ �״��, �ε����� +1�� ���ش�.
			index++;
		}
		
		for(int i = 0; i < N; i++) {
			sb.append(hash.get(input[i])).append(" ");
		}
		System.out.println(sb);
	}

}
