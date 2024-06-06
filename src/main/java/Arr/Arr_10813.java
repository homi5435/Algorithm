package Arr;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Arr_10813  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = i+1;
        }

        for (int j=0;j<m;j++){
            StringTokenizer stn = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stn.nextToken());
            int b = Integer.parseInt(stn.nextToken());
            int c = arr[a-1];
            int d = arr[b-1];
            arr[a-1] = d;
            arr[b-1] = c;
        }

        for (int k=0;k<n;k++){
            bw.write(arr[k]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
