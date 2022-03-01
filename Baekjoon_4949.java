import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_4949 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//���ѷ���
		while(true) {
			String input = br.readLine();
			//���ڿ��� �ڸ����� ���Ҷ� char������ Ȯ���ϱ⶧���� ������ Character�� �������ش�.
			Stack<Character> stack = new Stack<Character>();
			
			//.�� �ԷµǸ� ���ѷ��� ����
			if(input.equals(".")) break;
			
			for(int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				
				//���� ��ȣ�� ���ÿ� ����
				if(ch == '(' || ch == '[') stack.push(ch);
				
				//�ݴ� ��ȣ�϶� �� ������ �ɾ��ش�.
				if(ch == ')') {
					if(stack.empty()) {
						stack.push(ch);
						break;
					}
					
					if(stack.peek() == '(') stack.pop();
					else break;
				}else if(ch == ']') {
					if(stack.empty()) {
						stack.push(ch);
						break;
					}
					
					if(stack.peek() == '[') stack.pop();
					else break;
				}
			}
			//������ ����ִ��������� ���ο� ���� �ٸ� ��°��� sb�� ����
			if(stack.isEmpty()) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		System.out.println(sb);
	}

}
