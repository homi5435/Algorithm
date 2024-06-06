package Arr;

import java.io.*;
import java.util.StringTokenizer;

public class Arr_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n];

        for (int i=0;i<m;i++){
            StringTokenizer stn = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stn.nextToken());
            int e = Integer.parseInt(stn.nextToken());
            int b = Integer.parseInt(stn.nextToken());

            for (int j=s;j<=e;j++){
                num[j-1] = b;
            }
        }

        for (int k=0;k<n;k++){
            bw.write(num[k]+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
