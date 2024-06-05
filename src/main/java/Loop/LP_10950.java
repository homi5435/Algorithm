package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LP_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i < t; i++){
            String[] array = br.readLine().split(" ");
            int x = Integer.parseInt(array[0]);
            int y = Integer.parseInt(array[1]);
            System.out.println(x+y);
        }
    }
}
