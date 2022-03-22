import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11724 {
		static int N;
		static int[][] graph = new int[1001][1001];
		static boolean[] visit = new boolean[500000];
		//�׷쿡 ������ ���Դ��� Ȯ���ϱ� ���� ����
		static int CC = 0;
		//������ ���� ���(����)�� �ľ��ϱ� ���� ����
		static int count = 0;
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		//��°��� ������ ����
		int result = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u][v] = graph[v][u] = 1;
		}
		
		for(int i = 1; i <= N; i++) {
			DFS(i);
			//CC�� 0�� �ƴ϶�� �׷쿡 ���� ��尡 �ִٴ� ���̴�,
			//�׷��� ����(��� �� ����)�� +1�� ���ش�.
			if(CC != 0) {
				result++;
			}
			//count�� ������ ������ ���ٸ� ������ ���� �����̱⿡
			//�׷��� ������ +1�� ���ش�.
			if(count == N) {
				result++;
			}
			//Ȯ���� �������� CC�� count�� 0���� �ʱ�ȭ
			CC = 0;
			count = 0;
		}
		System.out.println(result);
	}
	
	//Ž�� �޼ҵ�
	public static void DFS(int node) {
		visit[node] = true;
		
		for(int i = 1; i <= N; i++) {
			if(!visit[i] && graph[node][i] == 1) {
				DFS(i);
				CC++;
				count = 0;
			}
			//���� ������ ����� ������ ���ٸ� count�� +1�� ���ش�.
			if(graph[node][i] == 0) {
				count++;
			}
		}
	}

}
