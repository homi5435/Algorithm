package Ge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ge_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
//        long u = 0, s = 0;
//
//        for (int i=0;i<n;i++){
//            s += 2;
//            u ++;
//        }
//        System.out.println(u + s + n);

        System.out.println(n*4);
    }
}
