package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ac2_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int max = 0;
        int min = 0;

        max = Max(x, y);
        min = x * y / max;
        System.out.println(max);
        System.out.println(min);
    }
    //재귀
    public static int Max(int x, int y){
        if(y == 0) return x;
        return Max(y, x%y);
    }
    //반복문
    public static int Max_1(int x, int y){
        while(y != 0){
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
