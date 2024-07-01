package Ge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ge_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            int l = Math.max(Math.max(x,y),z);
            int s = 0;
            if (l == x) s = y + z;
            else if (l == y) {
                s = x + z;
            }else s = x + y;

            if(x > 0 && y > 0){
                if (2*l == s){
                    System.out.println("Equilateral");
                }
                else if (s > l) {
                    if (x == y || x == z || y == z) System.out.println("Isosceles");
                    else System.out.println("Scalene");
                }
                else System.out.println("Invalid");

            }else break;
        }
    }
}
