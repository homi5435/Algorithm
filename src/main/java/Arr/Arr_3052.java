package Arr;

import java.io.*;
import java.util.HashSet;

public class Arr_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //using HashSet
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i = 0; i<10; i++){
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        bw.write(String.valueOf(h.size()));

//        int sum = 0;
//        boolean[] arr = new boolean[42];
//        for (int i=0;i<10;i++){
//            arr[Integer.parseInt(br.readLine()) % 42] = true;
//        }
//        for (boolean b : arr) {
//            if (b) {
//                sum++;
//            }
//        }
//        bw.write(String.valueOf(sum));
//
        bw.close();
        br.close();
    }
}
