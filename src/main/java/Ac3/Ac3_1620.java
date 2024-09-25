package Ac3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ac3_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        //조건에 따라 다르게 쓰일 두개의 HashMap
        HashMap<Integer, String> hash1 = new HashMap<>();
        HashMap<String, Integer> hash2 = new HashMap<>();


        for(int i = 1; i <= n; i++) {
            String s = br.readLine();
            hash1.put(i, s);
            hash2.put(s, i);
        }

        for(int i = 0; i < m; i++) {
            String s = br.readLine();
            //입력값이 번호인지 포켓몬이름인지 판별
            if(49 <= s.charAt(0) && s.charAt(0) <= 57) {
                sb.append(hash1.get(Integer.parseInt(s))).append("\n");
            }else {
                sb.append(hash2.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
