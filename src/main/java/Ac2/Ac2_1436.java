package Ac2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ac2_1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while(cnt != n) {
            num++;
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}
