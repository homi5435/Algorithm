package sudoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int rst = 0;

        for (int i=1; i<=b;i++){
            for (int j=1; j<=i; j++){
                cnt++;

                if (a <= cnt && cnt <= b){
                    rst += i;
                }
            }
        }
        System.out.println(rst);
    }
}
