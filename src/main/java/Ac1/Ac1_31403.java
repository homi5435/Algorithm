package Ac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac1_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String d = String.valueOf(a) + String.valueOf(b);
        int e = Integer.parseInt(d);

        System.out.println(a + b - c);
        System.out.println(e - c);
    }
}
