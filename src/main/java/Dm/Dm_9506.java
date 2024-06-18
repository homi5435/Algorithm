package Dm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dm_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while (true){
            int n = Integer.parseInt(br.readLine());
            if (n == -1)
                break;

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i=1; i<n; i++){
                if (n % i == 0){
                    list.add(i);
                    sum += i;
                }
            }
            str.append(n);
            if(n == sum){
                str.append(" = ");
                for (int i=0; i<list.size()-1; i++){
                    str.append(list.get(i) + " + ");
                }
                str.append(list.get(list.size()-1));
            }
            else str.append(" is NOT perfect.");

            str.append("\n");
        }
        System.out.println(str);
    }
}
