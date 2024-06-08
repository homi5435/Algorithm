package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String star = "*";
        int n = Integer.parseInt(br.readLine());
        int p = 2*n-1;
        for (int i=1; i<p+1; i+=2){
            for (int j=p; j>i; j-=2){
                System.out.print(" ");
            }
            System.out.println(star.repeat(i));
        }
        for (int k=p-2; k>0; k-=2){
            for (int q=p; q>k; q-=2){
                System.out.print(" ");
            }
            System.out.println(star.repeat(k));
        }
    }
}
