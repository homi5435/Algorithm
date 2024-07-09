package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class day2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //배열 크기
        int m = Integer.parseInt(st.nextToken()); //k씨가 일한 횟수
        int[] arr = new int[n];

        StringTokenizer stn = new StringTokenizer(br.readLine());
        for (int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(stn.nextToken());
        }

        for (int j=0;j<m;j++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stk.nextToken()); //k씨가 고른 배열의 시작
            int e = Integer.parseInt(stk.nextToken()); //k씨가 고른 배열의 끝
            int ch = Integer.parseInt(stk.nextToken()); //k씨가 고른 배열의 위치

            int[] arrk = new int[e - s + 1];
            int inc = 0;
            for(int k=s;k<=e;k++){
                arrk[inc] = arr[k-1];
                inc++;
            }
            Arrays.sort(arrk);
            System.out.println(arrk[ch - 1]);
        }
    }
}
