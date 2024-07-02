package Ac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ac1_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        int n = 1;
        int m = 8;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == n){
                n++;
            } else if (arr[i] == m) {
                m--;
            }
        }
        if (n == 9) System.out.println("ascending");
        else if (m == 1) {
            System.out.println("descending");
        }else System.out.println("mixed");

    }
}
