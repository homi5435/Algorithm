package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac2_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[10001];
        int n = Integer.parseInt(br.readLine());

        for (int i=0;i<n;i++){
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=1;i<10001;i++){
            while (cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
