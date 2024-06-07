package Arr;

import java.io.*;
import java.util.StringTokenizer;

public class Arr_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double avg = 0;

        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        for (int j=0; j<n; j++){
            //if (arr[j] != max)
            avg += arr[j]/max*100;
        }
        bw.write(String.valueOf(avg/n));
        bw.flush();
        bw.close();
        br.close();
    }
}
