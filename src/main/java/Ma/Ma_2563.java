package Ma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ma_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];
        int sum = 0;

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j=x;j<x+10;j++){
                for (int k=y;k<y+10;k++){
                    arr[j][k] = 1;
                }
            }
        }

        for (int i=0;i<100;i++){
            for (int j=0;j<100; j++){
                if (arr[i][j] == 1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}