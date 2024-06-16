package Dm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dm_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0) break;

            if (y % x == 0){
                sb.append(f);
            }
            else if(x % y == 0){
                sb.append(m);
            }
            else sb.append(n);
        }
        System.out.println(sb);
    }
}
