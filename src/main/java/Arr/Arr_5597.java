package Arr;

import java.io.*;
import java.util.*;

public class Arr_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] stn = new int[30];
        for (int i=0;i<28;i++){
            int sub = Integer.parseInt(br.readLine());
            stn[sub-1] = 1;
        }
        for (int j=0;j<30;j++){
            if (stn[j] != 1) bw.write((j+1)+"\n");
        }

        bw.close();
    }
}
