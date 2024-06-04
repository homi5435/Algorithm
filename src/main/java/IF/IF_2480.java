package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IF_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[1]);
        int z = Integer.parseInt(array[2]);
        if(x == y && x==z)
            System.out.println(10000+(x * 1000));
        else if(x==y | x==z)
            System.out.println(1000+(x * 100));
        else if (y==z)
            System.out.println(1000+(y * 100));
        else {
            int money = 0;
            money = Math.max(x ,(Math.max(y, z)));
            System.out.println(money * 100);
        }
    }
}
