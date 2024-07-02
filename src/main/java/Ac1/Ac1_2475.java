package Ac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ac1_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<5;i++){
            int n = Integer.parseInt(st.nextToken());
            sum += (int) Math.pow(n, 2);
        }
        int l = sum % 10;
        System.out.println(l);
    }
}
