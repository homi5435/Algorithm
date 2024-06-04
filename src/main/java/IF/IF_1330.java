package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IF_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String array[] = br.readLine().split(" ");
        long a = Long.parseLong(array[0]);
        long b = Long.parseLong(array[1]);
        if(a > b) System.out.println(">");
        else if (b > a) System.out.println("<");
        else System.out.println("==");
    }
}
