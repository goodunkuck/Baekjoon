import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_1874 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		//�迭�� �ε��� ���� ����� ����
		int index = 0;
		//1~n������ ���� ���� ����� ����
		int num = 1;
		
		//�Է°��� ������ ����
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//n���� ������ ������ ����⶧���� index�� 0���� n-1�����̱⶧���� n���� ������쿡 �ݺ��Ѵ�.
		while(index < n) {
			//stack�� ������� �ʴٴ� ���ǹ��� �� �־��ش�. �翬�ϴ� stack�� �Ӱ� �־�� pop�� ���״�
			if(!stack.empty() && arr[index] < stack.get(stack.size() - 1)) {
				break;
			}else if(!stack.empty() && arr[index] == stack.get(stack.size() - 1)) {
				stack.pop();
				sb.append("-").append("\n");
				index++;
			//push���ٶ��� stack�� ����־ �ȴ�.
			}else {
				while(num <= n) {
					if(arr[index] != num) {
						stack.push(num);
						sb.append("+").append("\n");
						num++;
					}else {
						stack.push(num);
						sb.append("+").append("\n");
						num++;
						break;
					}
				}
			}
		}
		
		if(index == n) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
	}

}
