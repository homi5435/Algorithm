package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ac2_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String h = br.readLine();
        BigInteger bighash = new BigInteger("0");

        for(int i=0;i<n;i++){
            bighash = bighash.add(BigInteger.valueOf(h.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(bighash.remainder(BigInteger.valueOf(1234567891)));
    }
    // 50점 짜리 코드 Large 통과 못함
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String h = br.readLine();
//        long hash = 0;
//
//        for(int i=0;i<n;i++){
//            int l = h.charAt(i) - 'a';
//            hash += (long) ((l+1) * Math.pow(31, i));
//        }
//        System.out.println(hash);
//    }
}
