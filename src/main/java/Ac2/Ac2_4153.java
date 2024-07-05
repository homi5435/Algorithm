package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ac2_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, z, max;
        boolean rw;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());

            if(x > 0 && y > 0){
                max = Math.max(Math.max(x,y),z);
                if (max == x){
                    rw = Math.pow(x, 2) == Math.pow(y, 2) + Math.pow(z, 2);
                }
                else if (max == y){
                    rw = Math.pow(y, 2) == Math.pow(x, 2) + Math.pow(z, 2);
                }
                else rw = Math.pow(z, 2) == Math.pow(x, 2) + Math.pow(y, 2);

                if (rw) System.out.println("right");
                else System.out.println("wrong");
            }else break;
        }
    }
}
