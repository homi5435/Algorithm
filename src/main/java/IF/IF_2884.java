package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IF_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        int h = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        if(m >= 45 && h >= 0) System.out.println(h+" "+(m-45));
        else if (m < 45 && h ==0) System.out.println((h+23)+" "+(m+15));
        else System.out.println((h-1)+" "+(m+15));
    }
}
