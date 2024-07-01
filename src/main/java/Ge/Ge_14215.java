package Ge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ge_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int l = Math.max(Math.max(x,y),z);
        int sum, s;
        if(l == x) s = y + z;
        else if (l == y) {
            s = x + z;
        }else s = x + y;

        if (2*l == s) System.out.println(l + s);
        else if (s - 1 < l){
            l = s - 1;
            System.out.println(l + s);
        }else System.out.println(l + s);
    }
}
