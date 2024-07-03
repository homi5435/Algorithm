package Ac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ac1_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); //호텔 높이
            int w = Integer.parseInt(st.nextToken()); //호텔 층당 방 갯수
            int n = Integer.parseInt(st.nextToken()); //손님의 순서
            int cnt = 1;
            while(n > h){
                n -= h; //남은 값이 동
                cnt++; // 값이 호수
            }
            if(cnt < 10){
                System.out.println(n + "0" + cnt);
            }else System.out.println(String.valueOf(n) + String.valueOf(cnt));
        }
    }
}
