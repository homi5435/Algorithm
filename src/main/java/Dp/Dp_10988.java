package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Dp_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuffer sb = new StringBuffer(word);
        String re = sb.reverse().toString();
        if (Objects.equals(word, re)) System.out.println(1);
        else System.out.println(0);
    }
}
