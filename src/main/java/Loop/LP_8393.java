package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LP_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int j = 0;
        for(int i=1; i <= n; i++){
            j += i;
        }
        System.out.println(j);

    }
}
