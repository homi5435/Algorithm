package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i=0; i<n; i++){
            String g = br.readLine();
            int[] arr = new int[26];
            int temp = 0;
            int check = 0;

            for (int j=0; j<g.length(); j++){
                int now = g.charAt(j);

                if (temp != now){
                    if (arr[now - 'a'] == 0){
                        arr[now - 'a']++;
                        temp = now;
                    } else check++;
                }
            }
            if (check == 0) cnt++;
        }
        System.out.println(cnt);
    }
}
