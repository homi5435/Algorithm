package Ge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ge_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[n][2];
        int s = 0;
        int w;
        int w_max = -10000;
        int w_min = 10000;
        int h;
        int h_max = -10000;
        int h_min = 10000;

        if (n == 1){
            System.out.println(s);
        } else{
            for (int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j=0;j<2;j++){
                    array[i][j] = Integer.parseInt(st.nextToken());
                    if (j == 0){
                        w_max = Math.max(w_max, array[i][j]);
                        w_min = Math.min(w_min, array[i][j]);
                    }
                    if (j == 1){
                        h_max = Math.max(h_max, array[i][j]);
                        h_min = Math.min(h_min, array[i][j]);
                    }
                }
            }
            w = w_max - w_min;
            h = h_max - h_min;
            s = w * h;
            System.out.println(s);
        }
    }
}
