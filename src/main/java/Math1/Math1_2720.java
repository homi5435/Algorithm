package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math1_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int Q = 0;
            int D = 0;
            int N = 0;
            int P = 0;

            int c = Integer.parseInt(br.readLine());
            while(c >= 25){
                c -= 25;
                Q++;
            }
            while (c >= 10){
                c -= 10;
                D++;
            }
            while (c >= 5){
                c -= 5;
                N++;
            }
            while (c >= 1){
                c -= 1;
                P++;
            }
            System.out.println(Q + " " + D + " " + N + " " + P + " ");
        }
    }
}
