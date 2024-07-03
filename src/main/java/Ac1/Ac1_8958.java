package Ac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac1_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++){
            String s = br.readLine();
            int cnt = 0; //O 연속 카운트, X시 0
            int sum = 0; //점수합

            for (int j=0;j<s.length();j++){
                if(s.charAt(j) == 'O'){
                    cnt++;
                }else cnt = 0;
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
