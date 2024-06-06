package Arr;
//if use StringTokenizer, must use StringTokenizer Input line by line
import java.io.*;
import java.util.StringTokenizer;

public class Arr_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        StringTokenizer stn = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(stn.nextToken());
            if (arr[i] < x) bw.write(arr[i] + " ");
        }
        bw.close();
        br.close();
    }
}
