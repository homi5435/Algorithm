package Dp;

import java.io.*;
import java.util.StringTokenizer;

public class Dp_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] wh = new int[st.countTokens()];
        int[] bl = {1, 1, 2, 2, 2, 8};

        for (int i=0; i<wh.length; i++){
            wh[i] = Integer.parseInt(st.nextToken());
            int nd = bl[i] - wh[i];
            bw.write(nd + " ");
        }
        bw.close();
        br.close();

    }
}
