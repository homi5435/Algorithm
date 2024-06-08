package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Dp_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double stn;
        double subject = 0;
        double total = 0;
        double g;
        for (int i=0; i<20; i++){
            String[] arr = br.readLine().split(" ");

            double sub = Double.parseDouble(arr[1]);
            if (Objects.equals(arr[2], "A+")){
                stn = 4.5;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "A0")){
                stn = 4.0;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "B+")){
                stn = 3.5;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "B0")){
                stn = 3.0;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "C+")){
                stn = 2.5;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "C0")){
                stn = 2.0;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "D+")){
                stn = 1.5;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "D0")){
                stn = 1.0;
                total += (stn * sub);
                subject += sub;
            }
            else if (Objects.equals(arr[2], "F")){
                stn = 0;
                total += (stn * sub);
                subject += sub;
            }
        }
        g = total / subject;
        System.out.println(g);
    }
}
