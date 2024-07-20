package elice;

import java.util.*;
//동적 프로그래밍 기업을 사용하여 문제 해결
class day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            a[i] = scanner.nextInt();
        }
        Map<List<Integer>, Integer> dp = new HashMap<>();
        dp.put(new ArrayList<>(Collections.nCopies(N, 1)), 0);
        Deque<List<Integer>> queue = new ArrayDeque<>();
        queue.add(new ArrayList<>(Collections.nCopies(N, 1)));
        while (!queue.isEmpty()) {
            List<Integer> v = queue.pollFirst(); //queue에서 리스트 v를 추출
            for (int i = 0; i < v.size(); i++) {
                for (int j = i + 1; j < v.size(); j++) {
                    //v의 모든 가능한 두 원소 i와 j를 선택하여, 새로운 리스트 u를 생성
                    List<Integer> u = new ArrayList<>();
                    for (int k = 0; k < v.size(); k++) {
                        if (k == i) {
                            u.add(v.get(i) + v.get(j));
                        } else if (k != j) {
                            u.add(v.get(k));
                        }
                    }
                    Collections.sort(u);
                    if (!dp.containsKey(u)) {
                        //u가 dp 맵에 없으면 queue에 추가하고, dp 맵에 u의 비용을 저장
                        queue.add(u);
                        dp.put(u, dp.get(v) + (1 - a[N - v.size()]) * v.get(i) * v.get(j));
                    } else {
                        //u가 dp 맵에 있으면, 기존 비용과 새로운 비용을 비교하여 최소 비용을 업데이트
                        dp.put(u, Math.min(dp.get(u), dp.get(v) + (1 - a[N - v.size()]) * v.get(i) * v.get(j)));
                    }
                }
            }
        }
        System.out.println(dp.get(Collections.singletonList(N)));
    }
}



