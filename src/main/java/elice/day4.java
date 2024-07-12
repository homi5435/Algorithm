package elice;

import java.util.*;

public class day4 {
    static long n, a, b; //n은 노드의 수, a와 b는 간선
    static ArrayList<Long>[] v = new ArrayList[100050]; //각 노드와 연결된 노드를 저장하는 리스트 배열
    static long[] dp = new long[100050]; //각 노드에 대한 결과값을 저장하는 배열
    static final long inf = (long)1e12; //무한대 값을 나타내는 상수

    static void dfs(long x, long par) { //x는 현재 노드, par은 부모 노드
        long ret = inf; //현재 노드의 최소 값을 저장하는 변수, 초기값은 무한대로 설정
        for (Long nxt : v[(int)x]) { //현재 노드 x와 연결된 모든 노드 순회
            if (nxt == par) continue; //부모 노드와 같은 노드이면 건너 뜀
            dfs(nxt, x); //자식 노드에 대해 DFS를 재귀 호출
            ret = Math.min(ret, dp[nxt.intValue()]); //결과값중 최소 값을 ret에 저장
        }
        if (ret == inf) ret = 0; //ret이 여전히 무한대면 0으로 설정
        dp[(int)x] = x - ret; //현재 노드 x의 결과값을 x - ret으로 설정
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        n=scanner.nextLong();

        for(int i=0;i<100050;i++)
            v[i]=new ArrayList<>();

        for(int i=1;i<n;i++){ //간선 정보를 입력 받아, 각 노드 리스트에 연결된 노드 추가
            a=scanner.nextLong();
            b=scanner.nextLong();

            v[(int)a].add(b);
            v[(int)b].add(a);
        }

        dfs(1,0); //루트 노드에서 DFS 시작

        for(int i=1;i<=n;i++){
            if(dp[i]>=0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
