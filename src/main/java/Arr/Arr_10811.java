package Arr;

import java.io.*;
import java.util.StringTokenizer;

public class Arr_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];
        for (int i=0;i<n;i++){
            basket[i] = i+1;
        }

        for (int j=0;j<m;j++){
            StringTokenizer stn = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stn.nextToken())-1;
            int e = Integer.parseInt(stn.nextToken())-1;

            while(s < e){
                int temp = basket[s];
                basket[s++] = basket[e];
                basket[e--] = temp;
            }
        }
        for (int t : basket) {
            bw.write(t+" ");
        }
        bw.close();
        br.close();

    }
}
