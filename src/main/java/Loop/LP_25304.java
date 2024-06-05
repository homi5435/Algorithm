package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LP_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i=0; i<n; i++){
            String[] array = br.readLine().split(" ");
            int cost = Integer.parseInt(array[0]);
            int num = Integer.parseInt(array[1]);
            total += cost * num;
        }
        if(total == x) System.out.println("Yes");
        else System.out.println("No");
    }
}
