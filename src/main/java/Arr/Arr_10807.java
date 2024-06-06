package Arr;

import java.io.*;
import java.util.StringTokenizer;

public class Arr_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer stn = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(stn.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int j=0; j<n; j++){
            if (v == arr[j]) cnt++;
        }
        System.out.println(cnt);
    }
}
