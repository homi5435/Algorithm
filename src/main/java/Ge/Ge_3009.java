package Ge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ge_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] co1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        st = new StringTokenizer(br.readLine());
        int[] co2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        st = new StringTokenizer(br.readLine());
        int[] co3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x;
        int y;

        if (co1[0] == co2[0]){
            x = co3[0];
        } else if (co1[0] == co3[0]) {
            x = co2[0];
        }
        else x = co1[0];

        if (co1[1] == co2[1]){
            y = co3[1];
        } else if (co1[1] == co3[1]) {
            y = co2[1];
        }
        else y = co1[1];

        System.out.println(x + " " + y);
    }
}
