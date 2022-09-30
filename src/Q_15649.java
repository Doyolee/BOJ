import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*백트래킹 - 트리 탐색 알고리즘
        -DFS  깊이우선탐색
        -BFS (Breadth First Search) 너비우선탐색
        DFS   한쪽 방향으로 쭉 / 막다르면(깊이==변수) 돌아가서 다음 구멍으로 이동/  모든 경우 고려시 유용
        -->재귀함수(정의단계에서 자신을 재참조)
        -->스택(LIFO)
        BFS   모든 분기점 검사 / 가지치기가 중요(오버플로우 위험을 낮추기위해) / 최소값 찾기 등에 유용
        -->큐(FIFO)
        발전된 형태 - Best First Search   현재 가장 최적인 경우부터 검사  --> 우선순위 큐
 */

public class Q_15649 {

    public static boolean visit[];
    public static int result[];
    public static StringBuilder sb;
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        visit=new boolean[N+1];
        result=new int[M];
        sb=new StringBuilder();

        dfs(0); //처음 깊이
        System.out.println(sb);
    }
    public static void dfs(int depth){
        if(depth==M){// 바닥에 도착하면 배열에 담긴 값들을 합쳐서 출력
            for(int val: result){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=1;i<=N;i++){//i구멍에서 탐색하는 반복문
            if(!visit[i]){
                visit[i]=true;
                result[depth]=i;
                dfs(depth+1); // 재귀함수 - 한 구멍으로 내려감
                visit[i]=false; // 다음 구멍으로 넘어가기 전에 초기화
            }
        }

    }
}
