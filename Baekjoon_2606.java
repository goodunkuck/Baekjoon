import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2606 {
	static int N;
	static int M;
	static int count = 0;
	static int[][] graph = new int[101][101];
	//������ �ִ� ������ �� �� �� ���⿡ ������ ū ���� ������.
	static boolean[] visit = new boolean[100000000];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u][v] = graph[v][u] = 1;
		}
		DFS(1);
		System.out.println(count);
	}
	
	public static void DFS(int node) {
		visit[node] = true;
		
		for(int i = 1; i <= N; i++) {
			if(!visit[i] && graph[node][i] == 1) {
				count++;
				DFS(i);
			}
		}
	}

}
