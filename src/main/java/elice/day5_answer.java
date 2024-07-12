package elice;

import java.util.*;

public class day5_answer {
    static ArrayList<Long> res = new ArrayList<>(); //결과값 저장 리스트
    static ArrayList<Long> now = new ArrayList<>(); //중간 결과값 저장 리스트

    //깊이 우선 탐색을 통해 가능한 모든 부분집합의 합을 구하고, 그 합에 m을 더해 중간 결과값에 저장
    public static void dfs(ArrayList<Long> res, int x, long sum_, ArrayList<Long> now, long m) {
        if (x == res.size()) { //x가 결과값의 크기와 같아지면 종료
            now.add(sum_ + m); //중간결과값에 sum_ + m을 더해줌
            return;
        }
        dfs(res, x + 1, sum_, now, m);
        dfs(res, x + 1, sum_ + res.get(x), now, m);
        //현재 원소를 포함하지 않는 경우와 포함하는 경우 두 가지로 나누어 재귀 호출
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //원본 수열의 갯수
        ArrayList<Long> v = new ArrayList<>(); // 부분 수열을 담을 리스트

        for (int i = 0; i < (1 << n); i++) { // 1<<n 은 2^n 의미
            long a = scanner.nextLong();
            v.add(a);
        }

        Collections.sort(v);

        for (int i = 1; i < v.size(); i++) {
            if (!now.contains(v.get(i))) {
                long m = v.get(i);
                dfs(res, 0, 0, now, m);
                res.add(v.get(i));
            }
            now.remove(v.get(i));
        }

        for (long nxt : res) {
            System.out.print(nxt + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solve();
    }
}
